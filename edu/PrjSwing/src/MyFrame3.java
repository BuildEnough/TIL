import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame {
	public MyFrame3() {
		setSize(400, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		
		panel.add(btn1, BorderLayout.NORTH);
		panel.add(btn2, BorderLayout.WEST);
		panel.add(btn3, BorderLayout.SOUTH);
		panel.add(btn4, BorderLayout.EAST);
		panel.add(btn5, BorderLayout.CENTER);
		
		MyFrame3 f = new MyFrame3();
		f.add(panel);
		
	}
}
