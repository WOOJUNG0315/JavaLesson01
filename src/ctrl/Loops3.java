package ctrl;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int menu;
        while ( true ) {
            // 메뉴 출력
            System.out.println("1. 돈까스");
            System.out.println("2. 냉면");
            System.out.println("3. 햄버거");
            System.out.println("4. 어묵");
            System.out.println("======================");
            System.out.print("메뉴를 선택하세요(0을 입력하면 종료) >>> ");

            // 사용자의 입력을 받음
            menu = sc.nextInt();
            if ( menu==0 )
                break;

            switch ( menu ) {
                case 1:
                    System.out.println("돈까스를 주문했습니다.");
                    break;

                case 2:
                    System.out.println("냉면을 주문했습니다.");
                    break;

                case 3:
                    System.out.println("햄버거를 주문했습니다.");
                    break;

                case 4:
                    System.out.println("어묵을 주문했습니다.");
                    break;

                default:
                    System.out.println("잘못 입력했습니다.");
            }
        }

        sc.close();
    }
}
