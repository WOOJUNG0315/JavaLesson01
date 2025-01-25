package thread;

public class ThreadTest {
    public static void main(String[] args) {
        // 두개의 Thread 객체를 생성한다.
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        // 커스텀 구현한 Runnable 클래스 객체를 생성하여 Thread를 만든다.
        Thread th3 = new Thread(new MyRunnable());
        Thread th4 = new Thread(new MyRunnable());

        Runnable ra = () -> {
            for(int i=0; i<20; i++) {
                try {
                    System.out.printf("[%s] i = %d\n", Thread.currentThread().getName(), i);
                    Thread.sleep(1);  // 대기시간
                } catch (InterruptedException e) {
                    System.out.println( e.getMessage() );
                }
            }
        };

        Thread th5 = new Thread(ra);
        Thread th6 = new Thread(ra);

        // 두개의 Thread를 각각 실행시킨다.
        th1.start();
        th2.start();

        // 두개의 Runnable Thread를 각각 실행시킨다.
        th3.start();
        th4.start();

        th5.start();
        th6.start();
    }
}
