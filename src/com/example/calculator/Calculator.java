package com.example.calculator; // 패키지 선언 : 이 파일은 com.example.calculator 패키지 안에 있다.

import java.util.Scanner; // import: "Scanner" 라는 도구를 사용하겠다.

public class Calculator { // 클래스 선언 : "Calculator" 라는 틀 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성 = 이 도구로 사용자 입력 받음.

        //무한루프 반복 시작
        while (true) {
            // while(true) = 무한 반복

            System.out.println("첫 번째 숫자를 입력하세요: "); //콘솔 창에 표현될 문장, println은 줄바꿈 기능
            int num1 = sc.nextInt(); //sc.nextInt() = int(정수) 받기
            //입력된 숫자를 int 타입으로 변환해서 num1로
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("입력한 숫자 : " + num1 + "," + num2);

            // 사칙연산 기호(➕,➖,✖️,➗)를 입력받기
            System.out.print("연산기호(+,-,*,/)를 입력하세요: ");
            char operator = sc.next().charAt(0);//문자열받기, 문자열에서 0번째 문자만 추출
            System.out.println("연산기호: " + operator);

            int result = 0;
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue; //잘못된 입력 다시 받기
                }
                result = num1 / num2;
            } else {
                System.out.println("연산기호를 올바르게 입력하세요.");
                continue; //잘못된 입력 다시 받기
            }
            System.out.println("결과: " + num1 + "" + operator + "" + num2 + "=" + result);
            System.out.println("더 계산하시려면 아무키나 누르세요.(exit 입력 시 종료됩니다.)"); // exit 입력 받으면 종료
            String choice = sc.next();
            if (choice.equals("exit")) {
                System.out.println("계산기가 종료합니다.");
                break;
            }
        }
    }
}
