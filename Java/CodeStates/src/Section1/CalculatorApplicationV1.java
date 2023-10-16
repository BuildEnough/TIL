package Section1;

import java.util.Scanner;

public class CalculatorApplicationV1 {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("🌟 숫자를 입력해주세요 : ");
            double leftOperand = input.nextDouble();
            input.nextLine();

            System.out.print("🌟 연산자를 입력해주세요 : ");
            String operator = input.nextLine().trim();

            System.out.print("🌟 숫자를 입력해주세요 : ");
            double rightOperand = input.nextDouble();

            double result;

            switch (operator) {
                case "+" :
                    result = leftOperand + rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                case "-" :
                    result = leftOperand - rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                case "*" :
                    result = leftOperand * rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                case "/" :
                    result = leftOperand / rightOperand;
                    System.out.println("계산 결과 : " + result);
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    break;
            }
        }
        while (true);
    }
}