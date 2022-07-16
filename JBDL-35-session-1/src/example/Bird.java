package example;

public class Bird implements Flyable{
    public Bird() {
    }

    @Override
    public void fly() {
        System.out.println("bird is flying");
    }
}
