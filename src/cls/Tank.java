package cls;

public class Tank extends Unit{
    private boolean seize;

    public Tank(String name) {
        setName(name);
        setHp(500);
        setPower(50);
        seize = false;
    }

    public void setSeize(boolean seize) {
        this.seize = seize;
    }

    public void attack(Unit target) {
        if ( seize )
            setPower(getPower()*3);
        else
            setPower(50);

        super.attack(target);
    }
}
