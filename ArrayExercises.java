package com.spartaglobal.rashawn;

public class ArrayExercises {

    public static void swap(int index1, int index2){
        int[] swapArray = {1,2,3};

         int tempArray[] = new int[1];
         tempArray[0] =  swapArray[index1];
         swapArray[index1] = swapArray[index2];
         swapArray[index2] = tempArray[0];

         for(int i = 0; i<swapArray.length; i++){
             Print.print("Array numbers are: " + swapArray[i]);
         }
    }

    public static void sumOddOrEvenNumbers(){
        int[] evenOdd = {1,2,3,4,5,6,7,8,9,10};
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;

        for(int number : evenOdd){
            if(number%2 == 0){
                evenNumbersSum+=number;
            }else{
                oddNumbersSum+=number;
            }
        }
        Print.print("Even numbers sum = " + evenNumbersSum);
        Print.print("odd numbers sum = " + oddNumbersSum);
    }



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


    public static void switchCase(int caseNumber) {

        switch (caseNumber) {
            case 1:
                forLoop(caseNumber);
                break;
            case 2:
                forEachLoop(caseNumber);
                break;
            case 3:
                doWhileLoop(caseNumber);
                break;
            case 4:
                whileLoop(caseNumber);
                break;

            default:
                Print.print("Invalid number chosen");
        }

    }


    public static void forLoop(int number){
        for(int i = 0; i< number; i++){
            Print.print("From the For loop");
        }
    }


    public static void forEachLoop(int number){
        int[] forEachArray = new int[number];
        for(int i : forEachArray){
            Print.print("From the For Each loop");
        }
    }


    public static void doWhileLoop(int number){
        do {
            Print.print("From the Do While loop");
            number--;
        }while(number > 2);
    }


    public static void whileLoop(int number){
        while(number > 3) {
            Print.print("From the While loop");
            number--;
        }
    }


}


