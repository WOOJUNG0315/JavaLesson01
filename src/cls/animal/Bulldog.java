package cls.animal;

public class Bulldog extends Dog {
    public Bulldog() {
        name = "불독";
        sound = "컹컹";
    }

    @Override
    public void crying() {
        System.out.printf("%s은 %s 크게 짖습니다.\n", name, sound);
    }
}
