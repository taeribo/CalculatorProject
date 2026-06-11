package com.example.calculator;

import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); // Scanner 객체 생성 = 이 도구로 사용자 입력 받음.

            //무한루프 반복 시작
        Calculator calculator = new Calculator();
            while (true) {
                // while(true) = 무한 반복

                System.out.println("첫 번째 숫자를 입력하세요: "); //콘솔 창에 표현될 문장, println은 줄바꿈 기능
                int num1 = sc.nextInt(); //sc.nextInt() = int(정수) 받기
                //입력된 숫자를 int 타입으로 변환해서 num1로
                System.out.println("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                // 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
                System.out.print("연산기호(+,-,*,/)를 입력하세요: ");
                char operator = sc.next().charAt(0);//문자열받기, 문자열에서 0번째 문자만 추출
                System.out.println("연산기호: " + operator);

                int result =
                 calculator.calculate(
                         num1,
                         num2,
                         operator
                 );
                System.out.println("결과 : " + num1 + operator + num2 + "=" + result);
                System.out.println("더 계산하시려면 아무키나 누르세요.(exit 입력 시 종료됩니다.)");// exit 입력 받으면 종료
                String choice = sc.next();
                if (choice.equals("exit")) {
                    System.out.println("계산기가 종료됩니다.");
                    break;
                }
            }
        }
    }