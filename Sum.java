package com.spartaglobal.rashawn;

public class Sum {
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
}
