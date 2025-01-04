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
