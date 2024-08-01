import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		JButton btnSave = new JButton("저장");
		this.add(btnSave, BorderLayout.NORTH);

		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}
}
