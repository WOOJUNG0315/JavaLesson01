package cls.sub;

public class SubTest {
    public static void main(String[] args) {
        Subject kor = new Subject("Korean");
        Subject eng = new Subject("Englich");
        Subject math1 = new Subject("Math");
        Subject math2 = new Subject("Math");

        System.out.println( kor );
        System.out.println( eng );

        System.out.println( math1 );
        System.out.println( math2 );

        // String tmp = "임시";

        if ( math1.equals(math2) )
            System.out.println("두 과목은 같습니다.");
        else
            System.out.println("두 과목은 다릅니다.");

        String str1 = new String("Math");
        String str2 = "Math";
//        String str2 = new String("Math");
        if (str1.equals(str2))
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");
    }
}
