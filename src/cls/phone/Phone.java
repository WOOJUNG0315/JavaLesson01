package cls.phone;

// interface : 메소드들이 모두 추상 메소드들로만 구성된 클래스
public interface Phone {

    public abstract boolean powerOn();
    public abstract void powerOff();
    public abstract int charge();
    public abstract boolean isOn();
    public abstract void playVideo();
}
