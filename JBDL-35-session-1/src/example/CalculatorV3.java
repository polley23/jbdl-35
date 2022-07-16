package example;

import java.util.Random;

public class CalculatorV3 extends CalculatorV2{
    public int divide(int a ,int b){
        return a/b;
    }

    @Override
    public int calculate(int a, int b, String operator) {
        return 2;
    }
}
