package com.company.homework1;

//       1. НОД(0, n) = n; НОД(m, 0) = m;
//       2. НОД(m, m) = m;
//       3.Если m, n чётные, то НОД(m, n) = 2*НОД(m/2, n/2);
//       4.Если m чётное, n нечётное, то НОД(m, n) = НОД(m/2, n);
//       5.Если n чётное, m нечётное, то НОД(m, n) = НОД(m, n/2);
//       6.Если m, n нечётные и n > m, то НОД(m, n) = НОД((n-m)/2, m);
//       7.Если m, n нечётные и n < m, то НОД(m, n) = НОД((m-n)/2, n);
public class task4 {

    public static void main(String[] args) {
       //System.out.println("Greatest common divisor finded by euclidean algorithm is:" + greatestCommonDivisor(100,20));

    }
    public static int greatestCommonDivisor(int m, int n) {

        if (m == 0 || n == 0) {
            return m | n;
        }
        if (m==n){
            return m;
        }
        if((m & 1)==0 && (n & 1)==0 ){
            return greatestCommonDivisor(m>>1, n)<<1;
        }
        else if((m & 1)==0){
            return greatestCommonDivisor(m>>1, n);
        }
        else if((n & 1)==0){
            return greatestCommonDivisor(m, n>>1);
        }
        else {
            if (n>m) {
                return greatestCommonDivisor((n - m) >> 1, m);
            }
                else{
                   return greatestCommonDivisor((m-n)>> 1 , n);
                }
            }
        }

    }

