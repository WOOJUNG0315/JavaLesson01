package cls.player;

public class PlayerTest {
    public static void main(String[] args) {
        // interface를 객체화시킬 수 없다
//        Player player = new Player();

        // interface를 구현(implements)한 클래스를 이용하여 객체를 생성할 수 있다.
        ApplePlayer player1 = new ApplePlayer();
        SamsungPlayer player2 = new SamsungPlayer();
    }
}
