import example.*;

public class Main {
    public static void main(String[] args) {
//        CalculatorV2 calculator = new CalculatorV2();
//        //System.out.println(test(calculator));
//        System.out.println(testAbstract(calculator));
//
//        Aeroplane aeroplane = new Aeroplane();
//        System.out.println(aeroplane.speed(100.2d));
//        Bird bird = new Bird();
//        testInterface(aeroplane);
//        testInterface(bird);

//
//        CalculatorV3 calculatorV3 = new CalculatorV3();
//
//        try {
//            calculatorV3.divide(5, 0);
//        } catch (DivideByZero e) {
//            e.printStackTrace();
//        }
//        int _a =10;
//        Integer a = _a;
//        System.out.println(a.hashCode());
//        a=20;
//        System.out.println(a.hashCode());


//        File file = new File("");
//        FileReader fileReader = new FileReader(file);
//        try {
//            fileReader.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println("Hello World");
//
        CollectionExample collectionExample = new CollectionExample();
        collectionExample.pQExample();
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