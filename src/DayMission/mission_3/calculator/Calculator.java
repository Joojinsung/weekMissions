package DayMission.mission_3.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        try {
            // 숫자1 입력
            num1 = sc.nextInt();
            // 숫자2 입력
            num2 = sc.nextInt();
            // 연산자 입력
            char operator = sc.next().charAt(0);
            // calculate 메소드 호출
            int result = calculate(num1, num2, operator);
            // 결과 출력
            System.out.println(result);
        } catch (DivideByZeroException | InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }
    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        // 사칙연산 수행 및 예외 처리
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new DivideByZeroException();
                }
                result = num1 / num2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        return result;
    }

}