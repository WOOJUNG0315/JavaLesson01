package ctrl;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        System.out.println("문자열");   // 라인 단위 출력
        System.out.print("문자열\t");    //

        int age = 10;
        String name = "홍길동";

        // 형식 문자열 출력
        // %d : 정수
        // %f : 실수
        // %c : 문자
        // %x : 16진수
        // %s : 문자열

        // 제어문자
        // \n : 줄바꿈
        // \t : 탭(tab)문자
        System.out.printf("%s님의\n나이는 %d살 입니다.\n", name, age );



        // 구구단
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 단수를 입력하세요 >>> ");
        int dan = sc.nextInt();   // 사용자의 정수 입력부분
        int i = 1;
        while ( i < 10 ) {
//            System.out.println(dan + " x " + i + " = " + dan+i);
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
            i += 1;
        }

        // 무한 반복
        i = 0;
        while ( true ) {
            System.out.print(i++);
            if ( i >= 10 )
                break;  // 즉시 탈출

            // 추가적인 명령문
        }

        sc.close();
    }
}
