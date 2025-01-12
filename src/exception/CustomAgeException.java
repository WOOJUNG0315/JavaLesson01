package exception;

// final이 class앞에 사용되었을때에는 더이상 상속받을 수 없는 class임을 의미한다
public final class CustomAgeException extends Exception {
    private final String message;

    public CustomAgeException (String msg) {
        message = msg;  // final로 지정된 변수(상수)는 생성자에서 한번 초기화된 후 값을 변경할 수 없다.
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
