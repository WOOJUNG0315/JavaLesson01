package generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void printSet(Set set) {
        // Set객체로부터 데이터를 가져오기
        for(Object name : set) {
            System.out.print( name );
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Collection : 데이터들을 특정한 자료구조의 형태로 저장해주는 클래스

        // List : ArrayList, LinkedList
        // 중복허용, 순서가있다(인덱싱)

        // Set : HashSet, TreeSet
        // 중복을 허용하지 않는다. 순서가 없다(인덱싱이 안됨)

        // Map : HashMap, TreeMap
        // 키(Key)와 값(Value)의 형태로 데이터를 저장한다. 순서가 없다(인덱싱이 안됨)

        Set<String> nameSet = new HashSet<>();
        // Set 객체에 데이터를 추가하기
        nameSet.add("안중근");
        nameSet.add("이순신");
        nameSet.add("세종대왕");
        nameSet.add("안중근");

        // Set객체로부터 데이터를 가져와서 출력하기
//        printSet( nameSet );
        System.out.println("nameSet : " + nameSet);

        // Set 객체에서 데이터 삭제하기
        nameSet.remove("안중근");  // 어떤 데이터가 저장되어 있는지 파악해야 삭제할 수 있다.

        printSet( nameSet );

        if(!nameSet.contains("안중근"))
            nameSet.add("안중근");

        // Set객체의 크기 알아보기
        System.out.printf("nameSet의 크기 : %d\n", nameSet.size());

        // 모두 삭제
        nameSet.clear();

        // Set객체의 크기 알아보기
        System.out.printf("nameSet의 크기 : %d\n", nameSet.size());
        printSet( nameSet );

        //
        // 1. 정수형 데이터를 저장할 수 있는 HashSet 인스턴스를 생성하세요
        // 2. for문을 이용하여 2, 4, 6, 8, 10을 입력하세요
        // 3. 해당 Set 인스턴스를 출력하세요
        // 4. 6을 삭제하세요
        // 5. 해당 Set 인스턴스의 개수를 출력하세요

        // TreeSet : 데이터를 정렬해준다
        TreeSet<Integer> intSet = new TreeSet<>();
        for (int i=1; i<=5; i++) {  // for(int i=2; i<=10; i+=2)
            intSet.add(i*2);        // intSet.add(i)
        }
        printSet(intSet);
        intSet.remove(6);
        System.out.printf("intSet의 크기 : %d\n", intSet.size());
        System.out.println( intSet );

        // 제일 마지막 값을 가져옴
        System.out.println("intSet.last() : " + intSet.last());
        // 첫번째 값을 가져옴
        System.out.println("intSet.first() : " + intSet.first());

        // 매개변수로 주어진 값보다 큰 값들 중에 최소값을 가져옴
        System.out.println("3보다 큼 : " + intSet.higher(3));

        // 매개변수로 주어진 값보다 작은 값들 중에 최대값을 가져옴
        System.out.println("3보다 작음 : " + intSet.lower(3));

        // Iterator : 반복자
        Iterator<Integer> iter = intSet.iterator();
        while( iter.hasNext() ) {
            Integer number = iter.next();
            System.out.println( number );
        }
    }
}
