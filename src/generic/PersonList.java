package generic;

import array.Array;
import cls.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PersonList {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 177.5F, 20);
        Person p2 = new Person("이순신", 185.5F, 30);
        Person p3 = new Person("세종대왕", 170.5F, 40);
        Person p4 = new Person("세종대왕", 170.5F, 40);

        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);

        //
        System.out.println("listPerson으로부터 출력");
        for(Person p : listPerson) {
            System.out.println( p );
        }

        // Set에 Person 객체를 저장하기
        System.out.println();

        if (p3.equals(p4))
            System.out.println("p3와 p4는 같습니다");
        else
            System.out.println("p3와 p4는 다릅니다");

        HashSet<Person> setPerson = new HashSet<>();
        setPerson.add(p1);
        setPerson.add(p2);
        setPerson.add(p3);
        setPerson.add(p4);

        System.out.println("setPerson으로부터 출력");
        for(Person p : setPerson) {
            System.out.println(p);
        }

        // 1 : p1(홍길동), 2 : p2(이순신), 3 : p3(세종대왕), 4 : p4(세종대왕)
        // HashMap 객체 mapPerson을 생성하고 위 데이터들을 저장하세요
        HashMap<Integer, Person> mapPerson = new HashMap<>();
        mapPerson.put(1, p1);
        mapPerson.put(2, p2);
        mapPerson.put(3, p3);
        mapPerson.put(4, p4);

        System.out.println(mapPerson.entrySet());
        for (Integer key : mapPerson.keySet()) {
            Person p = mapPerson.get(key);
            System.out.println("이름 : " + p.getName() + " / 키 : " + p.getHeight() + " / 나이 : " + p.getAge());
        }
    }
}
