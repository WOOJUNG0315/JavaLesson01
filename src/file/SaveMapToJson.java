package file;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SaveMapToJson {
    public static void main(String[] args) {
        /*
        * 이름 : 홍길동
        * 나이 : 25
        * 키 : 178.5
        * 지역 : 수원시
        * */

        // Map객체를 생성한다.
        HashMap<String, Object> myMap = new HashMap<>();

        // 콘솔(시스템) 입력 객체를 생성한다.
        Scanner sc = new Scanner(System.in);

        System.out.print("사용자 이름을 입력하세요 >>> ");
        String name = sc.nextLine();    // 키보드로부터 문자열을 입력받아서 name이라는 변수에 저장한다.

        System.out.print("나이(정수)를 입력하세요 >>> ");
        int age = Integer.parseInt( sc.nextLine() );     // 키보드로부터 정수를 입력받아서 age라는 변수에 저장한다.

        System.out.print("키(실수)를 입력하세요 >>> ");
        float height = Float.parseFloat( sc.nextLine() );    // 키보드로부터 실수를 입력받아서 height라는 변수에 저장한다.

        System.out.print("지역을 입력하세요 >>> ");
        String city = sc.nextLine();    // 키보드로부터 문자열을 입력받아서 city라는 변수에 저장한다.

        // Scanner 객체를 닫아준다.
        sc.close();

        // 맵 객체에 입력받은 데이터를 저장한다.
        myMap.put("user", name);
        myMap.put("age", age);
        myMap.put("height", height);
        myMap.put("city", city);

//        System.out.println( myMap );
        // Map 데이터를 JSON 형식으로 파일에 저장하기 위하여
        // 포함시킨 Gson 라이브러리로부터 Gson 클래스의 객체를 생성한다.
        Gson gson = new Gson();

        // gson객체를 이용하여 myMap 데이터를 JSON 형식 문자열로 변환
        String strJson = gson.toJson(myMap);
        System.out.println( "JSON 문자열 : " + strJson );

        // 파일명을 UserInfo.json 지정
        String filename = "UserInfo.json";

        // try with resource 구문을 이용하여 파일 저장 객체(FileWriter)를 생성한다.
        try( FileWriter fd = new FileWriter(filename) )
        {
            // 변환된 JSON 문자열을 파일에 저장한다.
            fd.write( strJson );
            System.out.printf("%s에 데이터를 저장하였습니다.\n", filename);
        } catch (IOException e) {
            System.out.printf("%s에 데이터를 저장하지 못했습니다.(%s)\n", filename, e.getMessage());
        }
    }
}
