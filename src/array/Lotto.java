package array;


import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        final int COUNT = 6;

        // 랜덤한값(난수)를 만들어주는 객체
        Random rand = new Random();

        int[] lotto = new int[COUNT];
        for(int i = 0; i<COUNT; i++) {
            lotto[i] = rand.nextInt(1, 46);
        }

        // for문을 이용하여 lotto배열 출력하기
        for(int i = 0; i<COUNT; i++) {
            System.out.printf("%3d", lotto[i]);
        }

    }
}
