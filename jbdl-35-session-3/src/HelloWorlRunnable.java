public class HelloWorlRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello World "+ Thread.currentThread().getName() );
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Thread.yield();
//
//        System.out.println("Sleep is over "+ Thread.currentThread().getName() );

    }
}
