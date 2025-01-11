package cls.inside;

import cls.Person;
import cls.player.Player;

public class InnerTest {
    public static void main(String[] args) {
        OuterClass out = new OuterClass("외부");
        OuterClass.InnerClass inner = out.new InnerClass("내부");

        // 내부 static 클래스의 객체화 방법
        OuterClass.InnerStaticClass inner2 = new OuterClass.InnerStaticClass();
        inner2.display(out);

        //
        // Person p1 = new Person("이름",189.0f,40);
        Person p1 = new Person.Builder()
                .name("홍길동")
                .height(185.3f)
                .age(30)
                .build(); // ---> new Person()

        // 익명 클래스(이름이 없는 클래스)
        Player myPlayer = new Player() {
            @Override
            public void play() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void pause() {

            }

            @Override
            public void reward() {

            }

            @Override
            public void forward() {

            }
        };

    }
}
