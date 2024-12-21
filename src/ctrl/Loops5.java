package ctrl;

public class Loops5 {
    public static void main(String[] args) {
//        for(int i=1; i<10; i++)
//            System.out.println("i의 값 : " + i);
//        }
        int total = 0;
        for (int i=1; i<=10; i++) {
            total += i;
        }
        System.out.println("total = " + total);
        total = 0;
        for (int i=1; i<10; i+=2) {
            total += i;
        }
        System.out.println("total = " + total);
    }
}
