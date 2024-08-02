import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PhoneBook extends JFrame implements ActionListener {

    static JTextField jTextSN, jTextName, jTextTelNo;
    JButton btnDown, btnUp, btnSave, btnModify, btnDelete;
    static String driver, url;
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static long count = 0;

    public PhoneBook() {
        JLabel label1 = new JLabel("Serial Number");
        JLabel label2 = new JLabel("Name");
        JLabel label3 = new JLabel("Tel Number");

        jTextSN = new JTextField(20);
        jTextName = new JTextField(20);
        jTextTelNo = new JTextField(20);

        JPanel panelUp = new JPanel();
        panelUp.setLayout(new GridLayout(0, 2));

        panelUp.add(label1);
        panelUp.add(jTextSN);
        panelUp.add(label2);
        panelUp.add(jTextName);
        panelUp.add(label3);
        panelUp.add(jTextTelNo);
        this.add(panelUp, BorderLayout.NORTH);

        btnDown = new JButton("<");
        btnDown.addActionListener(this);

        btnUp = new JButton(">");
        btnUp.addActionListener(this);

        btnSave = new JButton("Save");
        btnSave.addActionListener(this);

        btnModify = new JButton("Modify");
        btnModify.addActionListener(this);

        btnDelete = new JButton("Delete");
        btnDelete.addActionListener(this);

        JPanel panelDown = new JPanel();
        panelDown.add(btnDown);
        panelDown.add(btnUp);
        panelDown.add(btnSave);
        panelDown.add(btnModify);
        panelDown.add(btnDelete);
        this.add(panelDown, BorderLayout.SOUTH);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("NameCard");
        setVisible(true);
    }

    public static void main(String[] args) {
        new PhoneBook();
        try {
            dbConnect();
            query("select", "SELECT * FROM customer WHERE id = 1");
            count = 1;
            viewData();
            dbDis();
        } catch (Exception e) {
            System.out.println("Exception : main()");
            e.printStackTrace();
        }
    }

    static void dbConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Success!!");

            url = "jdbc:mysql://localhost/company";
            conn = DriverManager.getConnection(url, "root", "apmsetup");
            stmt = conn.createStatement();
            System.out.println("Connected to DB");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver error = " + e);
        } catch (SQLException e) {
            System.out.println("Connection error = " + e);
        }
    }

    static void query(String order, String sql) throws SQLException {
        if (order.equals("select")) {
            rs = stmt.executeQuery(sql);
        } else {
            stmt.executeUpdate(sql);
        }
    }

    static void viewData() throws SQLException {
        if (rs.next()) {
            jTextSN.setText(String.valueOf(rs.getLong("id")));
            jTextName.setText(rs.getString("name"));
            jTextTelNo.setText(rs.getString("telno"));
        } else {
            System.out.println("Nothing!");
            count--;
        }
    }

    static void dbDis() {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            System.out.println("Disconnected from DB");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDown) {
            dbConnect();
            try {
                count--;
                if (count < 1) count = 1;
                jTextSN.setText(String.valueOf(count));
                query("select", "SELECT * FROM customer WHERE id = " + count);
                viewData();
                System.out.println("Previous record");
            } catch (Exception e1) {
                System.out.println("Error: btnDown()");
                e1.printStackTrace();
            }
            dbDis();
        } else if (e.getSource() == btnUp) {
            dbConnect();
            try {
                count++;
                jTextSN.setText(String.valueOf(count));
                query("select", "SELECT * FROM customer WHERE id = " + count);
                viewData();
                System.out.println("Next record");
            } catch (Exception e1) {
                System.out.println("Error: btnUp()");
                e1.printStackTrace();
            }
            dbDis();
        } else if (e.getSource() == btnSave) {
            System.out.println("Save Button pressed");
        } else if (e.getSource() == btnModify) {
            System.out.println("Modify Button pressed");
        } else if (e.getSource() == btnDelete) {
            System.out.println("Delete Button pressed");
        }
    }
}
