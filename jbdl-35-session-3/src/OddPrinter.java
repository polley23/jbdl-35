public class OddPrinter implements Runnable{
    OddEvenPrinter oddEvenPrinter;

    public OddPrinter(OddEvenPrinter oddEvenPrinter) {
        this.oddEvenPrinter = oddEvenPrinter;
    }

    @Override
    public void run() {
        oddEvenPrinter.odd();
    }
}
