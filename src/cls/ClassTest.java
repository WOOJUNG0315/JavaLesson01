package cls;

import java.util.Random;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        // Primitive Data Type
        // byte, char, short, int, long, float, double, boolean
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        // Referenced Data Type
        String str1 = "Hello Java"; // 문자열 변수
        System.out.println( str1 );

        String str2 = new String("헬로우 자바");
        System.out.println( str2 );

        String str3 = new String();
        str3 = "이것은 자바 문자열입니다";

        // Scanner sc = new Scanner(System.in);
        // Random rand = new Random();

        Person kim = new Person("구라", 178.0F, 20);  // 객체가 생성되는 시점
        Person james = new Person("Dean", 180.1F, 30);
        Person tom = new Person("Cruz", 177.3F, 40);

        kim.introduce();     // 메소드에 접근
        james.introduce();
        tom.introduce();


        // Unit class test
        Unit u1 = new Unit("Tom",100,10);
        Unit u2 = new Unit("John",150,15);
        Unit u3 = new Unit();
        Unit u4 = new Unit("Tom",100,10);
        Unit u1_1 = u1;

        u3.setHp(200);
        u3.setPower(50);
        u3.setName("Lee");

//        int u1_hp = u1.getHp();
//        int u2_hp = u2.getHp();
        System.out.printf("u1의 HP는 %d입니다.\n", u1.getHp());
        System.out.printf("u2의 HP는 %d입니다.\n", u2.getHp());
        System.out.printf("u3의 HP는 %d입니다.\n", u3.getHp());

        System.out.printf("u1의 이름은 %s입니다.\n", u1.getName());
        System.out.printf("u2의 이름은 %s입니다.\n", u2.getName());
        System.out.printf("u3의 이름은 %s입니다.\n", u3.getName());

        System.out.printf("u1의 Power는 %d입니다.\n", u1.getPower());
        System.out.printf("u2의 Power는 %d입니다.\n", u2.getPower());
        System.out.printf("u3의 Power는 %d입니다.\n", u3.getPower());

        // 대리자를 이용하여 기능을 호출한다.
        u1_1.setName("Java");
        System.out.printf("u1의 이름은 %s입니다.\n", u1.getName());

        //
        u1.attack(u2);
        System.out.printf("u2의 HP는 %d입니다.\n", u2.getHp());
    }
}

/*
 * 클래스 이름 : Unit
 * Hp : int, 객체를 생성할 때 결정됨
 * power : int, 객체를 생성할 때 결정됨
 *
 * move : 반환값은 없음, 매개변수(x, y) : int, 외부에서 호출가능
 * "X, Y 위치로 이동합니다." 출력
 *
 * */

