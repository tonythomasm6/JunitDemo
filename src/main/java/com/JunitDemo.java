package com;

public class JunitDemo {

    public static void main(String args[]){
        CalculatorService cal = new CalculatorService();
        int a = cal.multiply(1,2);
        System.out.println(a);
    }
}
