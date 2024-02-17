package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1, 자바 학습, 참조 타입 String을 학습합니다., 홍길동";

        String[] token = board.split(",");

        System.out.println(token[0]);
        System.out.println(token[1]);
        System.out.println(token[2]);
        System.out.println(token[3]);

        for (int i = 0; i < token.length; i++) {
            System.out.println(token[i]);
        }
    }
}
