package example;

import java.util.Random;

public abstract class CalculatorV2 extends Calculator{

    @Override
    public Integer calculate(Integer a, Integer b, String operator) {
        return new Random().nextInt();
    }

    public int mul(int a , int b){
        return a*b;
    }

    public abstract int calculate(int a, int b, String operator);
}
