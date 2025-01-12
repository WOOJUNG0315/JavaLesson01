package exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Error :
// 1. Compile Error
// 2. Runtime Error : 개발중에도 발생, 런칭후에도 발생
// 3. Logic Error : 답이없다. 디버깅을 통해 논리적인 오류를 수정해야 한다.

public class Except01 {
    public static void main(String[] args) {
        // 예외(Exception)처리

        // NullPointerException
        try {
            String[] arr = null;
            System.out.println("arr의 0번째 요소 : " + arr[0]);
        } catch (NullPointerException e) {
            System.out.println( e.getMessage() );
        }

        // local(지역)
        {

        }

        // IndexOtrOfBounds
        String[] arr = new String[3];   //0, 1, 2
        try {
            arr[0] = "Hello";
            arr[3] = "World";   // 이 부분에서 Exception이 발생함
            System.out.println(arr[0] + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // catch 블록(지역)에는 가급적 안전한 코드를 만들어 주는게 바람직하다.
            System.out.println( "잘못된 인덱싱을 했습니다." );
            System.out.println( arr[0] );
        }

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수를 입력하세요 >>> ");

            // InputMismatchException, ArithmeticException
            int num = sc.nextInt();
            System.out.println(10 % num);
        } catch (InputMismatchException e) {
            System.out.println("입력값의 자료형이 올바르지 않습니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

        sc.close();



        System.out.println("프로그램이 정상적으로 종료됨");
    }
}
