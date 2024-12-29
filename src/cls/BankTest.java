package cls;

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345");
        BankAccount acc2 = new BankAccount("67890");

        acc1.deposit(100);
        acc1.print();

        acc2.deposit(300);
        acc2.print();

        acc1.whitdraw(50);
        acc1.print();

        acc2.whitdraw(100);
        acc2.print();

    }
}

/*
 * BankAccount : 클래스 이름
 * accountNumber : 문자열(계좌번호), 접근 금지
 * balance : 정수(잔액), 접근 금지
 *
 * 생성자 : 매개변수로 accountNumber만 입력받고, balance는 무조건 0으로 설정함.
 *
 * 메소드(기능)
 * deposit(입금) : 매개변수로 입금액(정수)를 주면 balance를 매개변수 값만큼 증가 시킴
 * 반환값 없음
 *
 * withdraw(출금) : 매개변수로 출금액(정수)를 주면 balance를 매개변수 박만큼 감소 시킴
 * 반환값 없음
 *
 * print : 매개변수 없고 반환값 없는 출력 기능
 * 출력 형식)
 * 현재 잔액은 XXX원 입니다.
 * */
