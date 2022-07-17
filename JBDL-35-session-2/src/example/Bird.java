package example;

public class Bird implements Flyable<Float,Float>{
    public Bird() {
    }

    @Override
    public void fly() {
        System.out.println("bird is flying");
    }

    @Override
    public Float speed(Float f) {
        return f;
    }
}
