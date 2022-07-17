package example;

public interface Flyable<T extends Number, P extends Number> {
    final static int wings = 2;
    void fly();
    default void flyHigh(){
        System.out.println("We don't support this here");
    }
    T speed(P p);
}
