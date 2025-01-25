package thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<20; i++) {
            try {
                System.out.printf("[%s] i = %d\n", Thread.currentThread().getName(), i);
                Thread.sleep(1);  // 대기시간
            } catch (InterruptedException e) {
                System.out.println( e.getMessage() );
            }
        }
    }
}
