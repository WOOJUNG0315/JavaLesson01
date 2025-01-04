package cls;

public class LottoSimulator {
    public static void main(String[] args) {
        WinLotto win = new WinLotto();
        System.out.println( "당첨번호 : " + win );  // 당첨 번호 출력

        int[] arr = new int[5];
        Lotto[] users = new Lotto[5];
        for (int i=0; i<5; i++) {
            users[i] = new Lotto();
            System.out.println( "구매번호 : " + users[i] );

            int rank = win.CheckLotto( users[i] );
            System.out.printf("%d 등\n", rank);
        }

        Lotto user = new Lotto();   // 5줄
        System.out.println( user ); // user.print();

        int rank = win.CheckLotto(user);
        System.out.printf("%d 등\n", rank);

        // win.print();
//        String str = win.toString();
//        System.out.println( str );
//        System.out.println( win );


    }
}
