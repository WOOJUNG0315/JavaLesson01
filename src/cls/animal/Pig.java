package cls.animal;

public class Pig extends Animal {

    public Pig() {
        name = "돼지";
        sound = "꿀꿀";
    }

    @Override
    public void crying() {
        System.out.printf("%s는 %s\n", name, sound);
    }
}
