package example;

public class Aeroplane implements Flyable<Double,Double>{
    public Aeroplane() {
    }

    @Override
    public void fly() {
        System.out.println("aeroplane is flying");
    }

    @Override
    public void flyHigh() {
        System.out.println("aeroplane is flying high");

    }

    @Override
    public Double speed(Double d) {
        return d;
    }
}
