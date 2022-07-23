public class IncrementorTask implements Runnable {
   private Incrementor incrementor;

   public IncrementorTask(Incrementor incrementor) {
      this.incrementor = incrementor;
   }

   @Override
   public void run() {
      incrementor.increment();
   }
}
