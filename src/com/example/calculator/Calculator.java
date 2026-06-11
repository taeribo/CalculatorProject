package com.example.calculator; // 패키지 선언 : 이 파일은 com.example.calculator 패키지 안에 있다.

import java.util.ArrayList; // import: "ArrayList" 라는 도구를 사용하겠다.

public class Calculator {// 클래스 선언 : "Calculator" 라는 틀 만들기

    private ArrayList<Integer> results
          = new ArrayList<>();

    public int calculate(
            int num1,
            int num2,
            char operator
    ) {
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator =='*') {
            result = num1 * num2;
        } else if (operator == '/') {

            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return 0;
            }
            result = num1 / num2;
        }
        results.add(result);
        return result;

    }
}