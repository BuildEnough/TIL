import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {
    final int ROCK = 0;
    final int PAPER = 1;
    final int SCISSOR = 2;
    
    JTextField jfieldMessage;
    JTextField jfieldOutput;
    
    JButton btnRock;
    JButton btnPaper;
    JButton btnScissor;
    
    RockScissorPaper() {
        jfieldMessage = new JTextField("아래 버튼 중 하나를 선택하세요");
        jfieldOutput = new JTextField("");
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));
        
        btnRock = new JButton("Rock");
        btnPaper = new JButton("Paper");
        btnScissor = new JButton("Scissor");
        
        btnRock.addActionListener(this);
        btnPaper.addActionListener(this);
        btnScissor.addActionListener(this);
        
        panel.add(btnRock);
        panel.add(btnPaper);
        panel.add(btnScissor);
        
        this.add(jfieldMessage, BorderLayout.NORTH);
        this.add(jfieldOutput, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.CENTER);
        
        setTitle("가위바위보 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int computer = (int) (Math.random() * 3);
        if (e.getSource() == btnRock) {
            if (computer == ROCK) {
                jfieldOutput.setText("무승부");
            } else if (computer == PAPER) {
                jfieldOutput.setText("컴퓨터 승");
            } else {
                jfieldOutput.setText("사용자 승");
            }
        } else if (e.getSource() == btnPaper) {
            if (computer == ROCK) {
                jfieldOutput.setText("사용자 승");
            } else if (computer == PAPER) {
                jfieldOutput.setText("무승부");
            } else {
                jfieldOutput.setText("컴퓨터 승");
            }
        } else if (e.getSource() == btnScissor) {
            if (computer == ROCK) {
                jfieldOutput.setText("컴퓨터 승");
            } else if (computer == PAPER) {
                jfieldOutput.setText("사용자 승");
            } else {
                jfieldOutput.setText("무승부");
            }
        }
    }

    public static void main(String[] args) {
        new RockScissorPaper();
    }
}
