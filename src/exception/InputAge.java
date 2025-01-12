package exception;

import java.util.Scanner;

public class InputAge {
    public int input() throws CustomAgeException, NumberFormatException {
        Scanner sc = new Scanner(System.in);
        int ret = Integer.parseInt(sc.nextLine());
        if (ret < 0)
            throw new CustomAgeException("나이는 0이상의 값을 입력해야 합니다.");
        sc.close();

        return ret;
    }
}
