package Section2;

import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자 입력");
        String str1 = sc.nextLine();

        System.out.println("사칙연산자 입력");
        String op = sc.nextLine();

        System.out.println("두 번째 숫자 입력");
        String str2 = sc.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result;

        if(op.equals("+")) {
            result = num1 + num2;
        }

        else if(op.equals("-")) {
            result = num1 - num2;
        }

        else if(op.equals("/")) {
            result = num1 / num2;
        }

        else {
            result = num1 * num2;
        }

        System.out.println(str1 + " " + op + " " + str2 + " = " + result);

    }
}
