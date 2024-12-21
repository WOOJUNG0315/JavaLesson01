package array;

public class Array {
    public static void main(String[] args) {
        // 정수형(short) 배열
        short[] arr = new short[3];
        arr[0] = 100;   // arr배열의 첫번째 아이템에 값 100을 대입
        arr[1] = 90;    // arr배열의 두번째 아이템에 값 90을 대입
        arr[2] = 80;    // arr배열의 세번째 아이템에 값 80을 대입

        // char형 배열 선언
        char[] str = new char[5];
        str[0] = 'A';
        str[1] = 'B';
        str[2] = 'C';
        str[3] = 'D';
        str[4] = 'E';

        // double형 배열(10)칸 선언
        double[] farr = new double[10];
        // 배열의 순번 ==> 인덱스(index)
        // index는 0부터 배열의 갯수 - 1까지 지정 가능하다.
        for (int i=0; i<10; i++) {
            farr[i] = (double) (i + 1); // 명시적 형변환하여 값을 대입
        }

        for (int i=0; i<10; i++) {
            System.out.println( farr[i] );
        }

        // arr배열에 for문을 이용하여 10, 20, 30을 대입하세요
        for (int i=0; i<3; i++) {
            arr[i] = (short) ((i + 1) * 10);
            System.out.println(arr[i]);
        }

        char ch = 'a';
        for (int i = 0; i<5; i++) {
            str[i] = (char) (ch + i);
            System.out.print( str[i] );
        }

    }
}
