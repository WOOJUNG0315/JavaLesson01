package cls;

import array.Array;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    private int[] lotto;

    public Lotto() {
        lotto = new int[6];
        gernerate();
    }

    public int[] getLotto() {
        return lotto;
    }

    public int find_value(int val) {
        for (int i=0; i<6; i++) {
            if (lotto[i] == val)
                return i;
        }

        // 못 찾음
        return -1;
    }

    public void sort() {
        // 순차 정렬
//        for (int i=0; i<5; i++) {
//            for (int j=i+1; j<6; j++) {
//                if (lotto[i] > lotto[j]) {
//                    int tmp = lotto[i];
//                    lotto[i] = lotto[j];
//                    lotto[j] = tmp;
//                }
//            }
//        }

        // 정렬
        Arrays.sort( lotto );
    }

    public void gernerate() {
        Random rand = new Random();
        int i = 0;
        while (i < 6) {
            int tmp = rand.nextInt(1,45);
            if (find_value(tmp) < 0)
                lotto[i++] = tmp;
        }

        sort();
    }

    public void print() {
        for (int i=0; i<6; i++) {
            System.out.printf("%3d", lotto[i]);
        }
        System.out.println();   // 줄바꿈
    }

    @Override
    public String toString() {
        String strOut = "";
        for (int i=0; i<6; i++) {
            // 임시 문자열 생성
            String tmp = String.format("%3d",lotto[i]);
            strOut += tmp;
        }

        return strOut;
    }
}
