package exception;

import java.util.Scanner;

public class Except04 {
    public static void main(String[] args) {
        // 나이를 입력하세요
        int age;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("나이를 입력하세요 >>> ");
            age = Integer.parseInt(sc.nextLine());
            if ( age <= 0 )
                throw new CustomAgeException("나이는 반드시 1이상의 값을 입력해야 합니다.");

            System.out.printf("입력한 나이는 %d살 입니다.\n", age);
        } catch (NumberFormatException e) {
            System.out.println("나이는 정수형으로 입력하여야 합니다.");
        } catch (CustomAgeException e) {
            System.out.println("던져진 예외(Exception) : ");
            System.out.println( e );
        }

        sc.close();
    }
}
