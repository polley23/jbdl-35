package example;

public class Aeroplane implements Flyable{
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
}
