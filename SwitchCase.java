package com.spartaglobal.rashawn;

public class SwitchCase {

    public  void switchCase(int caseNumber) {

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


    private void forLoop(int number){
        for(int i = 0; i< number; i++){
            Print.print("From the For loop");
        }
    }


    private void forEachLoop(int number){
        int[] forEachArray = new int[number];
        for(int i : forEachArray){
            Print.print("From the For Each loop");
        }
    }


    private void doWhileLoop(int number){
        do {
            Print.print("From the Do While loop");
            number--;
        }while(number > 2);
    }


    private void whileLoop(int number){
        while(number > 3) {
            Print.print("From the While loop");
            number--;
        }
    }


}
