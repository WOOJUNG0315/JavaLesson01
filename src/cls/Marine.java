package cls;

public class Marine extends Unit{
    // steampack : 논리형(boolean), 접근금지
    private boolean steampack;

    public Marine(String name) {
        setName(name);
        setHp(200);
        setPower(10);
        steampack = false;
    }

    // setSteamPack
    public void setSteamPack(boolean steampack) {
        this.steampack = steampack;
    }

    public void attack(Unit target) {
        if ( steampack )
            setPower(getPower()*2);
        else
            setPower(10);

        super.attack(target);   // 부모 클래스의 attack을 호출
    }
}


// 클래스 이름 : Tank from Unit
// 생성자 : 이름만 받아서 생성함, hp : 500, power : 50
// seize : boolean형 필드(멤버 변수) 선언하기
// setSeize : seize 변수를 설정하는 setter 메소드
// attack 메소드 재정의 seize가 참이면 공격력 3배 아니면 원래대로 50