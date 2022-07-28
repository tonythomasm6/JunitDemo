package com;

public class Calculator {

    CalculatorService cal =null;

    public Calculator(CalculatorService service){
        cal = service;
    }
    public int perform(int a , int b){

        return cal.multiply(a,b);
    }
}
