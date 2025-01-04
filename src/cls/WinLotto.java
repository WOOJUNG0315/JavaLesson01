package cls;

public class WinLotto extends Lotto {

    public int CheckLotto(Lotto user) {
        // 1 : 1등
        // 2 : 2등
        // ...
        int[] users = user.getLotto();

        int count = 0;
        for(int i=0; i<6; i++) {
            if (find_value(users[i]) >= 0)
                ++count;
        }
        System.out.printf("%d개 맞음\n", count);
        switch ( count )
        {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
        }

        return 0;   // 꽝!
    }

}
