public class EvenPrinter implements Runnable{
    OddEvenPrinter oddEvenPrinter;

    public EvenPrinter(OddEvenPrinter oddEvenPrinter) {
        this.oddEvenPrinter = oddEvenPrinter;
    }

    @Override
    public void run() {
        oddEvenPrinter.even();
    }
}
