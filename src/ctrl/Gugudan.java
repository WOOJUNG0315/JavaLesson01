package ctrl;

public class Gugudan {
    public static void main(String[] args) {
        //2단
        /*
         * 2 x 1 = 2
         * 2 x 2 = 4
         * ...
         * 2 x 9 = 18        *
         * */

//        int i = 2;
//        int j = 1;
//        while (j <= 9) {
//            System.out.printf("%d x %d = %d\n", i, j, i*j);
//            j += 1;
//        }
        int i = 1;
//        System.out.println("2단");
//        while ( i <= 9 ) {
//            System.out.printf("2 x %d = %d\n", i, 2*i);
//            i++; // i = i + 1, ++i, i+=1
//        }
//
//        i = 1;
//        System.out.println("3단");
//        while ( i <= 9 ) {
//            System.out.printf("3 x %d = %d\n", i, 3*i);
//            i++;
//        }
        int dan = 2;
        while ( dan < 10 ) {
            i = 1;
            System.out.printf("%d단\n", dan);
            while (i < 10) {
                System.out.printf("%d x %d = %d\n", dan, i, dan * i);
                i++;
            }

            dan += 1;
        }
    }
}
