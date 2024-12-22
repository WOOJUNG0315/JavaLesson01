package array;      // 현재 클래스가 존재하는 패키지(그룹)

// 모듈(java의 시스템 패키지(클래스들))
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        // 상수를 정의한다.
        final int COUNT = 6;    // 값을 변경할 수 없다. 선언할 때 초기화 한다.

        // 랜덤한값(난수)를 만들어주는 객체를 생성한다.
        Random rand = new Random();

        int[] lotto = new int[COUNT];   // int형 1차원 배열 6칸짜리를 생성한다.
        int k = 0;
        while ( k < COUNT ) {
            boolean find = false;
            int tmp = rand.nextInt(1, 46); // 1~45사이의 난수를 생성한다.
            for (int j=0; j<COUNT; j++) {
                if (lotto[j] == tmp) {
                    // tmp(난수)값이 배열에 이미 존재함
                    System.out.println("중복있음 : " + tmp);
                    find = true;    // 찾았다는 신호를 세팅함(true로 만듦)
                    break;  // 안쪽 반복문 탈출
                }
            }
            if (!find)  // 못 찾았으면 난수값을 대입   // 이 부분으로 나옴
                lotto[k++] = tmp;   // lotto의 i번째 요소에 값을 대입한 뒤 i를 1증가시킴
        }

        // for문을 이용하여 lotto배열 출력하기
        for(int i = 0; i<COUNT; i++) {
            System.out.printf("%3d", lotto[i]);
        }
        System.out.println();   // 줄바꿈

        // 정렬(순차 정렬, Sequential Sort)
        for (int i = 0; i<COUNT-1; i++) {
            for (int j = i+1; j<COUNT; j++) {
                if (lotto[i] > lotto[j]) {
                    // 배열의 요소들의 값을 교환한다.
                    int tmp = lotto[i]; // lotto[i]값을 백업
                    lotto[i] = lotto[j];
                    lotto[j] = tmp;
                }
            }
        }

        // for문을 이용하여 lotto배열 출력하기
        for(int i = 0; i<COUNT; i++) {
            System.out.printf("%3d", lotto[i]);
        }
    }
}
