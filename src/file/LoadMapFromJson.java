package file;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoadMapFromJson {
    public static void main(String[] args) {
        // 포함시킨 Gson 라이브러리로부터 Gson 클래스의 객체를 생성한다.
        Gson gson = new Gson();

        String filename = "UserInfo.json";
        try(FileReader fd = new FileReader(filename))
        {
            // 와일드카드 형식을 이용하여 Map 데이터를 읽어들임
            Map<?, ?> readMap = gson.fromJson(fd, Map.class);

            // 읽어들인 Map안의 모든 요소들을 차례대로 entry 객체에 불러온다.
            for(Map.Entry<?, ?> entry : readMap.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("모든 데이터를 읽었습니다.");
        } catch (IOException e) {
            System.out.printf("%s 파일로부터 데이터를 읽는 중 오류가 발생했습니다.(%s)\n", filename, e.getMessage());
        }
    }
}
