package Section1;

import java.util.Scanner;

public class CalculatorApplicationV2 {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);

        do {
            // 계산에 필요한 숫자와 연산자 입력
            System.out.print("🌟 숫자를 입력해 주세요 : ");
            String leftOperand = input.nextLine().trim();

            System.out.print("🌟 연산자를 입력해 주세요 : ");
            String operator = input.nextLine().trim();

            System.out.print("🌟 숫자를 입력해 주세요 : ");
            String rightOperand = input.nextLine().trim();
            String formula = leftOperand + operator + rightOperand;

            // 유효성 검증
            if (validate(formula)) {
                // 계산 수행
                double result = calculate(Double.parseDouble(leftOperand), operator, Double.parseDouble(rightOperand));
                System.out.println("계산 결과 : " + result);
            } else {
                System.out.println("입력한 계산식이 올바르지 않습니다.");
            }

        }
        while (true);
    }

    private static boolean validate(String formula) {
        return isValidFormulaString(formula) && isValidOperator(formula) && isValidNumbers(formula);
    }

    // 유효한 계산식 문자열인가(연산자는 추가 검증 필요)
    private static boolean isValidFormulaString(String formula) {
        return formula.matches("^[0-9\\s+\\-*/]+$");
    }

    // 유효한 연산자인가
    private static boolean isValidOperator(String formula) {
        String operators = "+-*/";
        int operatorCount = 0;
        for (char c : formula.toCharArray()) {
            if (operators.indexOf(c) != -1) {
                operatorCount++;
            }
        }

        return operatorCount == 1;
    }

    // 유효한 숫자인가
    private static boolean isValidNumbers(String formula) {
        boolean result = true;
        String[] numbers = formula.split("[-+*/]");
        for (String number : numbers) {
            if (!number.trim().matches("^[0-9]+$")) {
                result = false;
                break;
            }
        }
        return result;
    }

    // 유효한 연산자인가
    private static double calculate(double leftOperand, String operator, double rightOperand) {
        double result = 0.0;

        switch (operator) {
            case "+" :
                result = leftOperand + rightOperand;
                break;
            case "-" :
                result = leftOperand - rightOperand;
                break;
            case "*" :
                result = leftOperand * rightOperand;
                break;
            case "/" :
                result = leftOperand / rightOperand;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }

        return result;
    }
}