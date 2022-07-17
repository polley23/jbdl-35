package example;

public class CalculatorV3 extends CalculatorV2{
    public int divide(Integer a ,Integer b) throws DivideByZero {
        try {
            int c = a / b;
            return c;
        }catch (ArithmeticException e){
            if(b==0)
                throw new DivideByZero(e.getMessage());
            else
                throw e;
        }finally {
            System.out.println("Hey I am in finally block");
        }
    }

    @Override
    public int calculate(int a, int b, String operator) {
        return 2;
    }
}
