package cls.car;

public class Poter extends Truck {
    public Poter() {
        // 부모 클래스의 생성자 호출
        super(1000);
        // setCap(1000);
    }

    @Override
    public void load(int weight) {

    }
}
