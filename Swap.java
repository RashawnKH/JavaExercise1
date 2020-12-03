package com.spartaglobal.rashawn;

public class Swap {

    public static void swapIndexValue(int index1, int index2){
        int[] swapArray = {1,2,3,4,5,6};

        int tempArray[] = new int[1];
        tempArray[0] =  swapArray[index1];
        swapArray[index1] = swapArray[index2];
        swapArray[index2] = tempArray[0];

        for(int i = 0; i<swapArray.length; i++){
            Print.print("Array numbers are: " + swapArray[i]);
        }
    }
}
