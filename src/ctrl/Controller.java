package ctrl;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        // 조건문
        /* 첫번째 형식
        * if ( 조건식 ) {
        *   // 지역(LOCAL)
        *   조건식이 참인경우 실행될 명령문 1
        *   조건식이 참인경우 실행될 명령문 2
        *   조건식이 참인경우 실행될 명령문 3
        * ...
        * }
        * */


        /* 두번째 형식
        * if (조건식 1) {
        *   조건식1이 참인경우 실행될 명령문들...
        * } else (조건식 2) {
        *   조건식2이 참인경우 실행될 명령문들...}
        * } else (조건식 3) {
        *   조건식3이 참인경우 실행될 명령문들...
        * } else {
        *   위 조건식들이 모두 거짓인 경우에 실행될 명령문들...
        * }
        * */

        /* 세번째 형식
         * if ( 조건식 ) {
         *   조건식이 참인경우 실행될 명령문들...
         * } else {
         *   조건식이 거짓인경우 실행될 명령문들...
        * */
        // 콘솔로부터 입력받을 수 있는 입력 객체를 생성한다.
        Scanner sc = new Scanner(System.in);

        // 콘솔에 프롬프트를 출력한다.
//        System.out.print("숫자를 입력하세요 >>> ");
//        int number = sc.nextInt(); // 콘솔로부터 정수를 입력받아 number라는 변수에 대입

         // number를 판단하여 출력 여부를 결정한다.
//        if (number % 2 == 0) {
//            System.out.println("입력한 값 " + number + "는 짝수입니다.");
//        }
//
//                if (number % 2 == 0) {
//            System.out.println("입력한 값 " + number + "는 짝수입니다.");
//        } else {
//                    System.out.println("입력한 값 " + number + "는 홀수입니다.");
//                }

        // 응용문제
        // 임의의 정수를 입력받아서 해당 정수가 6의 배수인지 판단하여 출력하여 출력하는 프로그램을 작성하세요
        // 숫자를 입력하세요 >>> 36
        // 입력한 값 36은 6의 배수입니다.
        // 숫자를 입력하세요 >>> 35
        // 입력한 값 35는 6의 배수가 아닙니다.


//        System.out.print("숫자를 입력하세요 >>> ");
//                if (number % 6 == 0) {
//                    System.out.println("입력한 값 " + number + "은 6의 배수입니다.");
//                } else {
//                    System.out.println("입력한 값 " + number + "은 6의 배수가 아닙니다.");
//                }
        // 응용문제2
        // 국어, 역사 두 과목의 시험 점수를 입력받아서
        // 두 과목의 평균값이 60정 이상이면 합격, 미만이면 불합격을 출력하세요.

        // 출력방식()
        // 국어 점수를 입력하세요 >>> 80
        // 역사 점수를 입력하세요 >>> 80
        // 평균은 80.0입니다. 합격입니다.

//        System.out.print("국어 점수를 입력하세요 >>> ");
//        int number = sc.nextInt();
//        System.out.print("역사 점수를 입력하세요 >>> ");
//        int number2 = sc.nextInt();
//        float sum = (float)((number + number2) / 2.0F);
//        if (sum >= 60.0F){
//            System.out.println("평균은 " + sum + "점 입니다. 합격입니다.");
//                } else {
//                    System.out.println("평균은 " + sum + "점 입니다. 불합격입니다.");
//                }
//        int kor;    // 국어 점수
//        int his;    // 역사 점수
//        int total;  // 총합
//        float avg;  // 평균
//        System.out.print("국어 점수를 입력하세요 >>> ");
//        kor = sc.nextInt();
//
//        System.out.print("역사 점수를 입력하세요 >>> ");
//        his = sc.nextInt();
//
//        total = kor + his; // 총합을 구한다.
//        avg = total / 2.0F;
//        if ( avg >= 60.0F ) {
//            System.out.println("평균은 " + avg + " 점 입니다. 합격입니다");
//        } else {
//            System.out.println("평균은 " + avg + " 점 입니다. 불합격입니다");
//        }

        // 응용문제3
        // 키를 입력받아서 120.0cm 이상이면 놀이기구 탑승 가능, 미만이면 탑승 불가를 출력하세요
        //
        // 키를 입력하세요 >>> 176.6
        // 놀이기구 탑승 가능

        // 키를 입력하세요 >>> 113.5
        // 놀이기구 탑승 불가

//        float tall;
//
//        System.out.print("키를 입력하세요 >>> ");
//        tall = sc.nextFloat();
//        if (tall > 120.0F) {
//            System.out.println("놀이기구 탑승 가능");
//        } else {
//            System.out.println("놀이기구 탑승 불가");
//        }

        // 지하철 요금 계산기
        // 일반(19세 이상 65세 미만) : 1500원
        // 청소년(14세 이상 19세 미만) : 1000원
        // 어린이(8세 이상 14세 미만) : 500원
        // 유아(0세 ~ 7세) : 0원
        // 어르신(65세 이상) : 0원

//        int age;
//        age = sc.nextInt();
//
//        if (age >= 65) {
//            System.out.println("지하철 요금은 0원입니다.");
//        } else if (age >= 19 && age < 65) {
//            System.out.println("지하철 요금은 1500원입니다.");
//        } else if (age >= 14 && age < 19) {
//            System.out.println("지하철 요금은 1000원입니다.");
//        } else if (age >= 8 && age < 14) {
//            System.out.println("지하철 요금은 500원입니다.");
//        } else {
//            System.out.println("지하철 요금은 0원입니다.");
//        }

        // switch ~ case
        /*
        switch (변수)
        {
        case 값1:{
                변수의 값이 1일때 실행할 명령문들...
        }

        case 값2:{
                변수의 값이 2일때 실행할 명령문들...
        }
        case 값3:
                변수의 값이 3일때 실행할 명령문들...
        }
        */

        System.out.println("1. 돈까스");
        System.out.println("2. 냉면");
        System.out.println("3. 김밥");
        System.out.println("4. 순대");
        System.out.println("5. 어묵");
        System.out.println("6. 안시킴");

        System.out.print("메뉴 번호를 선택하세요 >>> ");
        int menu =sc.nextInt();

        switch ( menu ) {
            case 1: {
                System.out.println("돈까스 주문 완료했습니다.");
                break;
            }

            case 2: {
                System.out.println("냉면 주문 완료했습니다.");
                break;
            }

            case 3: {
                System.out.println("김밥 주문 완료했습니다.");
                break;
            }

            case 4: {
                System.out.println("순대 주문 완료했습니다.");
                break;
            }

            case 5: {
                System.out.println("어묵 주문 완료했습니다.");
                break;
            }


            // 1 ~ 5에 해당하지 않는 경우 명령을 실행
            default: {
                System.out.println("주문을 안하고 그냥 나가겠습니다.");
                break; // 없어도 무방
            }
        }

        System.out.println("프로그램을 종료합니다.");

        sc.close();


    }
}
