package cls.player;


// 추상 메소드들로만 구성된 특별한 클래스
public interface Player {

    void play();
    void stop();
    void pause();
    void reward();
    void forward();
}

// 두개의 클래스를 만든다 ---> Player를 implements한다
// SamsungPlayer
// ApplePlayer
