import example.*;

public class Main {
    public static void main(String[] args) {
        CalculatorV2 calculator = new CalculatorV2();
        //System.out.println(test(calculator));
        System.out.println(testAbstract(calculator));

        Aeroplane aeroplane = new Aeroplane();
        Bird bird = new Bird();
        testInterface(aeroplane);
        testInterface(bird);


    }
    public static int test(Calculator calculator){
        return calculator.calculate(2,3,"+");
    }

    public static int testAbstract(AbstractCalculator calculator){
        return calculator.calculate(2,3,"+");
    }

    public static void testInterface(Flyable flyable){
       flyable.flyHigh();
    }//strategy design pattern


}