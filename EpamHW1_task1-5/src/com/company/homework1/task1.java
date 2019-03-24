package com.company.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Please input number in binary format: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String binary = bufferedReader.readLine();

        //int decimal = Integer.parseInt(binary, 2);
        //System.out.println(decimal);

        System.out.println( "\"" + binary +"\"" + " -> " + binaryToDecimal(binary));


    }
        public static int binaryToDecimal(String binary){
        int decimal = 0;
        outer :{
                for (int i = 0; i < binary.length(); i++) {
                    switch (binary.charAt(binary.length() - 1 - i)) {
                        case '1':
                            decimal += Math.pow(2, i);
                            break;
                        case '0':
                            break;
                        default:
                            System.out.println("Error, number is not in binary format");
                            break outer;
                    }
                }
            }
            return decimal;
        }

       }



