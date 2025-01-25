package thread;

public class Counter {
    private int count;
    public Counter() {
        count = 0;
    }

    // 해당 메소드를 동기화 처리함
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
