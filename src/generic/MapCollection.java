package generic;

import java.util.*;

public class MapCollection {
    public static void main(String[] args) {
        // Map : HashMap, TreeMap
        // 키(Key)와 값(Value)의 형태로 데이터를 저장한다. 순서가 없다(인덱싱이 안됨)
//        ArrayList<String> strList = new ArrayList<>();
//        HashSet<Integer> intSet = new HashSet<>();
        // HashMap<Key, Value>
        // TreeMap<Key, Value>
        HashMap<String, String> dictMap = new HashMap<>();

        // Map객체에 데이터를 저장(입력)
        dictMap.put("spring", "봄"); // key:spring, value:봄
        dictMap.put("summer", "여름");
        dictMap.put("fall", "가을");
        dictMap.put("winter", "겨울");    // 해당 키가 존재하지 않으면 입력(INSERT)
        dictMap.put("winter", "완전추운겨울");    // 해당 키가 이미 존재한다면 값(VALUE)를 수정
        dictMap.put("Autumm", "가을");    // 키는 중복될 수 없고, value는 중복 가능
        //
        System.out.println( dictMap );

        System.out.println( dictMap.get("winter") );

        // 데이터 존재 여부 체크
        if(dictMap.containsKey("winter"))
            dictMap.put("winter", "겨울");

        if(!dictMap.containsValue("완전추운겨울"))
            System.out.println("해당 데이터가 존재하지 않습니다.");

        // Map 객체에서 모든 Key들을 불러오기
        Set<String> keySet = dictMap.keySet();
        System.out.println(keySet);

        Set<Map.Entry<String, String>> entrySet = dictMap.entrySet();
        System.out.println(entrySet);

        // 1. TreeMap 객체(intMap)를 생성하세요
        // 2. "one":1, "two":2, "three":3
        // 3. "two"에 해당하는 값을 가져와서 출력하기
        // 4. keyset 출력하기
        // 5. Map.Entry Set 출력하기
        TreeMap<String, Integer> intMap = new TreeMap<>();
        intMap.put("one", 1);
        intMap.put("two", 2);
        intMap.put("three", 3);
        System.out.println(intMap.get("two"));

//        System.out.println(intMap,keySet());
        Set<String> keySet2 = intMap.keySet();
        System.out.println(keySet2);

//        System.out.println(intMap.entrySet());
        Set<Map.Entry<String, Integer>> mapEntry = intMap.entrySet();
        System.out.println(mapEntry);

        for(String key : intMap.keySet()) {
            System.out.println(key + " : " + intMap.get(key));
        }
    }
}
