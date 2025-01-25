package thread;

public class SyncThread {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable ra1 = () -> {
            for(int i=0; i<1000; i++) {
                counter.increment();
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread th1 = new Thread( ra1 );
        Thread th2 = new Thread( ra1 );

        th1.start();
        th2.start();

        try {
            th1.join(); // th1이 종료될때까지 대기한다
            th2.join(); // th2이 종료될때까지 대기한다
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total Count = " + counter.getCount());
    }
}
