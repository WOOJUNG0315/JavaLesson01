package cls.animal;

public class Dog extends Animal {
    public Dog() {
        name = "강아지";
        sound = "멍멍";
    }

    @Override
    public void crying() {
        System.out.printf("%s는 %s\n", name, sound);
    }
}

// Dog를 상속받아
// Jindo 클래스를 구현하고,
// name은 "진도"
// sound "왈왈"
// crying() 구현하기

// Bulldog 클래스 구현하기
// name = "불독"
// sound = "컹컹"
// crying() 구현하기