package cls;

public class BankAccount {
    private String accountNumber;
    private int balance;


    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(int money) {
        balance += money;
        System.out.printf("[ %s ] %d원 입금되었습니다.\n",accountNumber, money);
    }
    public void whitdraw(int money) {
        balance -= money;
        System.out.printf("[ %s ] %d원 출금되었습니다.\n",accountNumber, money);
    }

    public void print() {
        System.out.printf("[ %s ] 현재 잔액은 %d원 입니다.\n",accountNumber, balance);
    }
}
