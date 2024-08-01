import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = { "Backspace", "", "", "CE", "C",
								"7", "8", "9", "/", "sqrt",
								"4", "5", "6", "x", "%",
								"1", "2", "3", "-", "1/x",
								"0", "+/-", ".", "+", "=",
							  };

	public Calculator() {
		tField = new JTextField(35); // 너비가 35인 텍스트 필드를 생성
		panel = new JPanel();
		tField.setText("0.0"); // 초기 텍스트를 "0."으로 설정
		tField.setEnabled(true); // false: 텍스트 필드를 비활성화하여 사용자가 직접 입력하지 못하게 함, true: 수정 가능
		panel.setLayout(new GridLayout(5, 5, 10, 10)); //  5x5 그리드 레이아웃을 설정
		buttons = new JButton[25]; // 총 버튼 칸 수
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if (cols >= 3) {					
					buttons[index].setForeground(Color.red); // 3열 이상 빨간색
				} else {					
					buttons[index].setForeground(Color.blue); // 3열 이하 파란색
				}
				buttons[index].setBackground(Color.yellow); // 배경색 노랑
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack(); // 컴포넌트 크기에 맞게 창 크기를 자동 조절
	}

	public static void main(String args[]) {
		Calculator s = new Calculator();
	}
}
