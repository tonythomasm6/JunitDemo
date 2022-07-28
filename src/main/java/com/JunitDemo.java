package com;

public class JunitDemo {

    public static void main(String args[]){
        CalculatorService service = new CalculatorService();
        Calculator calculator = new Calculator(service);
        int a = calculator.perform(1,2);
        System.out.println(a);
    }
}
