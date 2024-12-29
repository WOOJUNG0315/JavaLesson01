package cls;

public class Unit {
    private int hp;
    private int power;
    private String name;

    public Unit() {
        hp = 0;
        power = 0;
        name = "";
    }

    public Unit(String name, int hp, int power) {
        // this : 객체 자기 자신을 가리키는 참조 변수
        this.name = name;
        this.hp = hp;
        this.power = power;
        System.out.printf("%s : hp:%d, power:%d\n",this.name, this.hp, this.power);
    }

    // method, member, function
    public void move(int x, int y) {
        System.out.printf("(%d, %d) 위치로 이동합니다.\n", x, y);
    }

    // 메소드의 정의 방법
    // 접근제한자 반환형 메소드이름(매개변수들...)
    public int getHp()  {
        return hp;
    }

    // 이름 변환하는 메소드
    public int getPower() {
        return power;
    }

    // power 변환하는 메소드
    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        if ( hp < 0 )
            return; // 메소드 강제 종료

        this.hp = hp;
    }

    public void setPower(int power) {
        if ( power < 0 )
            return;

        this.power = power;
    }

    public void setName(String name) {
        if ( !name.isEmpty() ) { // name 문자열이 빈문자열이 아니면
        // if ( name.length() > 0 ) {  // String.length() : 문자열의 길이를 반환하는 메소드
            // 이름의 길이가 0보다 크면 이름값을 설정함
            this.name = name;
        }
    }

    public void damage(int power) {
        hp -= power;
        System.out.printf("%s의 HP : %d\n", name, hp);
    }

    public void attack(Unit target) {
        target.damage(power);
        System.out.printf("%s가 %s를 공격함\n", name, target.getName());
    }
}


