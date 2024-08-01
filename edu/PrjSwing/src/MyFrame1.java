import javax.swing.*;
import java.awt.*;

public class MyFrame1 extends JFrame {
    public MyFrame1() {
        setTitle("MyFrame");
        setSize(600, 200); // 창 크기 조정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 상단의 텍스트 라벨
        JLabel label = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하세요.", JLabel.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.CYAN);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("맑은 고딕", Font.BOLD, 16)); // 글꼴과 크기 설정
        add(label, BorderLayout.NORTH);

        // 버튼 패널
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // 버튼 사이의 간격 조정

        // 각 피자 버튼 (배경색과 텍스트 색상 설정)
        JButton gomboButton = new JButton("콤보피자");
        gomboButton.setBackground(Color.GREEN);
        gomboButton.setForeground(Color.BLACK);
        gomboButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));

        JButton potatoButton = new JButton("포테이토피자");
        potatoButton.setBackground(Color.GREEN);
        potatoButton.setForeground(Color.BLACK);
        potatoButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));

        JButton bulgogiButton = new JButton("불고기피자");
        bulgogiButton.setBackground(Color.GREEN);
        bulgogiButton.setForeground(Color.BLACK);
        bulgogiButton.setFont(new Font("맑은 고딕", Font.BOLD, 14));

        buttonPanel.add(gomboButton);
        buttonPanel.add(potatoButton);
        buttonPanel.add(bulgogiButton);

        // 패널을 가운데에 추가
        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyFrame1 frame = new MyFrame1();
            frame.setVisible(true);
        });
    }
}
