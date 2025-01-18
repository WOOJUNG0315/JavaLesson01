package generic;

import cls.Person;

public class DataListTest {
    public static void main(String[] args) {
        // DataList 인스턴스를 생성함
        DataList<Integer> list = new DataList<Integer>(10);

        // 데이터를 추가함
        for(int i=0; i<15; i++) {
            list.add(i+1);
        }

        // 데이터리스트로부터 데이터를 가져와서 출력함
        for(int i=0; i<10; i++) {
            System.out.println(list.get(i));
        }

        // 실수를 저장하려는 시도
        DataList<Float> list2 = new DataList<Float>(5);
        list2.add(3.14F);
        list2.add(42.195F);

        DataList<String> list3 = new DataList<>(3);
        list3.add("문자열1");
        list3.add("문자열2");
        list3.add("문자열3");
        for(int i=0; i<3; i++) {
            System.out.println( list3.get(i) );
        }

        DataList<Person> listPerson = new DataList<>(3);
        listPerson.add(new Person("james",177.0F,20));
        listPerson.add(new Person("홍길동",174.0F,25));
        listPerson.add(new Person("이순신",185.5F,35));

        for(int i=0; i<3; i++) {
            System.out.println( listPerson.get(i) );
        }


//        System.out.println( list );
        // 1,2,3,4,5,6,7,8,9,10
    }
}
