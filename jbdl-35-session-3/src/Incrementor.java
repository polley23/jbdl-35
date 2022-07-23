import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Incrementor  {
    AtomicInteger a;

    public Incrementor(Integer a) {
        this.a = new AtomicInteger(a);
    }

     void increment(){
        a.addAndGet(1);
    }
}
