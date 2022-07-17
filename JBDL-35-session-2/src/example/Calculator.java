package example;

public class Calculator extends AbstractCalculator{
    public Calculator(){

    }
    public Integer calculate(Integer a,Integer b,String operator){
        if(operator.equals("+"))
            return add(a,b);
        return -99;
    }

    private int add(int a,int b){
        return a+b;
    }

    private int add(int a,int b,int c){
        return a+b;
    }


}
