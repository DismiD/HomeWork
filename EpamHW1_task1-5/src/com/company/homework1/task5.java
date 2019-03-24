package com.company.homework1;


public class task5 {


    public static void main(String[] args) {
        changeBitByPosition(4,1);
    }

    public static void changeBitByPosition (int num, int pos){
        int additionalNum = 1 << pos;
        System.out.println("Here is the new number after changing bit by position: " + (num^additionalNum));

    }

}

