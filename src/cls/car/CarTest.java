package cls.car;

public class CarTest {
    public static void main(String[] args) {
        // car1 : Sedan 인스턴스 생성
        Sedan car1 = new Sedan(4);

        // truck1 : Truck 인트턴스 생성
        Poter truck1 = new Poter();

        CarLoader loader = new CarLoader();
        loader.load(car1);
        loader.load(truck1);
        loader.load(new Car() {
            @Override
            public void go() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void turn(boolean left) {

            }
        });
    }
}
