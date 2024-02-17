package ch04.sec02;

import java.util.Random;

public class IfDiceExample2 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.println(random.nextInt(6)+1);
        }
    }
}
