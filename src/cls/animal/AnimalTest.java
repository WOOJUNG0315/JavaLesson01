package cls.animal;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal ani = new Animal();
//        System.out.println( ani );
//        ani.crying();

        Pig pig = new Pig();
        System.out.println( pig );  // Animal class의 toString 호출
        pig.sound = "꾸잉꾸잉";
        pig.crying();

        Dog dog = new Dog();
        System.out.println( dog );
        dog.crying();

        // 챔피온(class)
        // 케이틀린, 가렌
    }
}
