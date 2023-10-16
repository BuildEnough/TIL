package Section1;

import java.util.Scanner;

public class CalculatorApplication {
    // 내가 만든 코드
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);

        // 결과(result)값 초기화
        double result = 0;

        // 처음 숫자 입력
        System.out.println("첫 번째 숫자 입력: ");
        double firstNumber = input.nextDouble();

        // 연산자 입력
        System.out.print("연산자 입력(+, -, *, /): ");
        char operation = input.next().charAt(0);

        // 연산자 유효성 검증
        boolean OperatorBoolean = OperatorEffectiveness(operation);
        while(OperatorBoolean) {
            System.out.print("연산자 입력(+, -, *, /): ");
            operation = input.next().charAt(0);
            OperatorBoolean = OperatorEffectiveness(operation);
        }

        // 두 번째 숫자 입력
        System.out.print("두 번째 숫자 입력: ");
        double secondNumber = input.nextDouble();

        // 계산
        result = Calculate(operation, result, firstNumber, secondNumber);

        // 계산 결과 출력
        System.out.println("계산: " + result);

        // 반복문 반복결정하는 boolean 값
        boolean keepBoolean = true;

        while(keepBoolean) {
            // 연속 계산할건지 물어보기
            System.out.println("계산 결과에 이어 연산을 진행하시겠습니까?");
            System.out.println("Yes면 'y' 혹은 'Y'입력, No면 다른 아무 값 입력");
            char keepInputCheck = input.next().charAt(0);

            // 연산자 입력
            if((keepInputCheck == 'y') || (keepInputCheck == 'Y')) {
                firstNumber = result;
                System.out.println("현재까지 계산 값: " + result);
                System.out.print("연산자 입력(+, -, *, /): ");
                operation = input.next().charAt(0);

                // 연산자 유효성 검증
                OperatorBoolean = OperatorEffectiveness(operation);
                while(OperatorBoolean) {
                    System.out.print("연산자 입력(+, -, *, /): ");
                    operation = input.next().charAt(0);
                    OperatorBoolean = OperatorEffectiveness(operation);
                }

                // 연산할 숫자 입력
                System.out.print("연산할 숫자 입력: ");
                secondNumber = input.nextDouble();

                // 계산
                result = Calculate(operation, result, firstNumber, secondNumber);
                System.out.println("계산: " + result);
            }
            else {
                keepBoolean = false;
                System.out.println("최종 계산: " + result);
                System.out.println("계산 종료");
            }
        }

    }

    private static double Calculate(char operation, double result, double firstNumber, double secondNumber) {
        if (operation == '+') result = firstNumber + secondNumber; // 덧셈
        else if (operation == '-') result = firstNumber - secondNumber; // 뺄셈
        else if (operation == '*') result = firstNumber * secondNumber; // 곱셈
        else if (operation == '/') result = firstNumber / secondNumber; // 나눗셈
        return result;
    }

    private static boolean OperatorEffectiveness(char operation) {
        if(!((operation =='+') || (operation =='-') || (operation =='*') || (operation =='/'))) {
            System.out.println("연산자 입력 오류, 재입력해주세요.");
            return true;
        }
        return false;
    }
}