package com.company.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Please input a negative number : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();

        int num = Integer.parseInt(string);
        changeSign(num);

    }

    public static void changeSign(int num){
        System.out.println("Your number with a positive sign is: " + (~num+1));
    }
}
