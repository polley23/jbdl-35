package example;

public interface Flyable {
    final static int wings = 2;
    void fly();
    default void flyHigh(){
        System.out.println("We don't support this here");
    }
}
