public class OddEvenPrinter {

    int a;
    int max;

    public OddEvenPrinter(int a, int max) {
        this.a = a;
        this.max = max;
    }

    void odd(){
        while(a<max) {
            synchronized (this) {
                if (a % 2 == 1) {
                    a++;
                    System.out.println(a);
                        this.notify();
                }else{
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }



            }
            System.out.println("waiting");

        }
    }

    void even(){
        while(a<max) {
            synchronized (this) {
                if (a % 2 == 0) {
                    a++;
                    System.out.println(a);
                    this.notify();
                }else{
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

    }
}
