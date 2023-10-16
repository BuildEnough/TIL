package Section1;

import java.util.Scanner;

public class CalculatorApplicationV3 {
    private static final String INPUT_GUIDANCE_LABEL = "계산할 숫자를 연산자와 함께 입력해 주세요: 예) 1 + 4";
    private static final String INPUT_WRONG_MESSAGE = "입력한 계산식이 올바르지 않습니다.";
    private static final String ADDITION = "+";
    private static final String SUBTRACTION = "-";
    private static final String MULTIPLICATION = "*";
    private static final String DIVISION = "/";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            LogPrinter.print(INPUT_GUIDANCE_LABEL);
            String input = inputFormula();

            if (validate(input)) {
                double result = calculate(input);
                LogPrinter.print(String.valueOf(result));
            } else {
                LogPrinter.print(INPUT_WRONG_MESSAGE);
            }
        } while (true);
    }

    private static String inputFormula() {
        return scanner.nextLine();
    }

    private static double calculate(String input) {
        String[] parsedElements = parseFormula(input);

        return calculateOperation(
                Double.parseDouble(parsedElements[0]),
                parsedElements[1],
                Double.parseDouble(parsedElements[2]));
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

    private static String[] parseFormula(String input) {
        String withoutSpaces = input.replaceAll("\\s", ""); // 공백 제거
        String operator = withoutSpaces.replaceAll("[0-9]", ""); // 연산자 추출
        String[] numbers =  withoutSpaces.split("[-+*/]"); // 앞, 뒤 숫자 추출
        String[] parsedElements = new String[3];

        parsedElements[0] = numbers[0];
        parsedElements[1] = operator;
        parsedElements[2] = numbers[1];

        return parsedElements;
    }

    private static double calculateOperation(double num1, String operator, double num2) {
        double result = 0.0;

        switch (operator) {
            case ADDITION:
                result = add(num1, num2);
                break;
            case SUBTRACTION:
                result = subtract(num1, num2);
                break;
            case MULTIPLICATION:
                result = multiply(num1, num2);
                break;
            case DIVISION:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        return result;
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}