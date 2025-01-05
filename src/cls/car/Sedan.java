package cls.car;

public class Sedan implements Car {
    private int doors;

    public Sedan() {
        doors = 0;
    }

    public Sedan(int doors) {
        this.doors = doors;
    }


    @Override
    public void go() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turn(boolean left) {

    }
}
