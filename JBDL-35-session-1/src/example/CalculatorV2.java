package example;

import java.util.Random;

public class CalculatorV2 extends Calculator{

    @Override
    public int calculate(int a, int b, String operator) {
        return new Random().nextInt();
    }

    public int mul(int a , int b){
        return a*b;
    }
}
