package cls.phone;

public class ApplePhone implements Phone {
    private boolean on;

    public ApplePhone() {
        on = false;
    }

    @Override
    public boolean powerOn() {
        on = true;
        return on;
    }

    @Override
    public void powerOff() {
        on = false;
    }

    @Override
    public int charge() {
        return 0;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void playVideo() {

    }
}
