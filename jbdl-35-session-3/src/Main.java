import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//       for(int i=0;i<100;i++){
//           System.out.println("Hello World "+ Thread.currentThread().getName());
//       }
//        Thread t1 = new Thread(new HelloWorlRunnable(),"thread1");
//        Thread t2 = new Thread(new HelloWorlRunnable(),"thread2");
//        t1.setPriority(4); t2.setPriority(2);
//        t1.start();t2.start();
//
//        System.out.println("Hello World "+ Thread.currentThread().getName());
//        System.out.println("Sleep is over "+ Thread.currentThread().getName() );

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<10;i++){
//                    System.out.println(i);
//                    if(i==5)
//                        Thread.yield();
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//               System.out.println("Happy Coding");
//            }
//        });
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();
//        ExecutorService executorService = Executors.newFixedThreadPool(100);
//        for(int i=0;i<1000;i++){
//            executorService.submit(new HelloWorlRunnable());
//        }
//        //executorService.shutdown();

//       Incrementor incrementor = new Incrementor(0);
//        ExecutorService executorService = Executors.newFixedThreadPool(20);
//        for(int i=0;i<10000;i++){
//            executorService.submit(new IncrementorTask(incrementor));
//        }
//       executorService.shutdown();
//       executorService.awaitTermination(1000000,TimeUnit.MILLISECONDS);
//       System.out.println(incrementor.a);
        OddEvenPrinter oddEvenPrinter = new OddEvenPrinter(0,10000);
        Thread oddThread = new Thread(new OddPrinter(oddEvenPrinter));
        Thread evenThread = new Thread(new EvenPrinter(oddEvenPrinter));
        evenThread.start(); oddThread.start();




    }
}//0,1,2,3,4,5...