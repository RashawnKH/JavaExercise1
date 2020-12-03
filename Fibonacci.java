package com.spartaglobal.rashawn;

public class Fibonacci {


    public static void fibonacci(int amountOfNumbers){
        int number1 = 0;
        int number2 = 1;
        int currentFibonacci;
        int fibonacciArray[] = new int[amountOfNumbers];
        fibonacciArray[0] = number1;
        fibonacciArray[1] = number2;

        for(int i=2; i<amountOfNumbers; i++){
            currentFibonacci = number1 + number2;
            fibonacciArray[i]= currentFibonacci;
            number1 = number2;
            number2 = currentFibonacci;
        }

        for(int fibonacci : fibonacciArray){
            Print.print("Fibonacci Numbers are: " + fibonacci);
        }

    }
}
