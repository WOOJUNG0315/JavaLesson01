package ctrl;

import java.util.Scanner;

public class Loops4 {
    public static void main(String[] args) {
        // 반복문
        // do + while()

        int i = 5;
        while (i < 5) {
            System.out.println("[while] i = " + i);
        }
        do {
            System.out.println("[do+while] i = " + i);
        } while (i < 5);

        // 키보드로부터 데이터를 입력받는 객체를 생성한다.
        Scanner sc = new Scanner(System.in);
        int selectedMenu;   // 입력받을 int형 변수를 선언한다.
        do {
            System.out.println("1. 새파일");
            System.out.println("2. 저장하기");
            System.out.println("3. 오픈하기");
            System.out.println("4. 인쇄하기");
            System.out.println("5. 종료하기");
            System.out.println("=================");
            System.out.println("위 명령중 하나의 번호를 선택하세요 >>> ");

            selectedMenu = sc.nextInt();
            System.out.println(selectedMenu + "번을 선택했습니다.");
        } while (selectedMenu != 5);
        sc.close();
    }
}
