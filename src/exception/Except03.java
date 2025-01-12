package exception;

import java.util.Scanner;
// Object
public class Except03 {
    public static void main(String[] args) {

        int finalTest = 10;

        int number;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("정수를 입력하세요 >>> ");
            number = Integer.parseInt(sc.nextLine());
            System.out.println("나누기 연산 : " + 10 % number);
        } catch ( ArithmeticException e ) {
            System.out.println("연산 중 오류가 발생했습니다.");
        } catch ( NumberFormatException e ) {
            System.out.println("정수를 입력하셔야 됩니다.");
        } catch ( Exception e ) {
            System.out.println( e.getMessage() );
        } finally {
            // try~catch를 처리한 뒤 무조건 실행되는 블록
            // 리소스 반환 등 반드시 실행되어야 할 구문을 작성하는 블록
            // 가급적 안전한 코드로 작성해준다.
            sc.close();
            finalTest = 500;
        }
        
        System.out.println("프로그램이 정상적으로 종료되었습니다." + finalTest);
    }
}
