import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(400, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		JButton btn3 = new JButton("Button3");
		JButton btn4 = new JButton("Button4");
		JButton btn5 = new JButton("Button5");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		
		MyFrame2 f = new MyFrame2();
		f.add(panel);
		
	}
}
