package cls.animal;

public class Jindo extends Dog {
    public Jindo() {
        name = "진도";
        sound = "왈왈";
    }

    @Override
    public void crying() {
        System.out.printf("%s개는 %s 짖습니다.\n", name, sound);
    }
}
