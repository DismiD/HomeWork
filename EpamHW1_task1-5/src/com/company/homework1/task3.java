package com.company.homework1;

public class task3 {

    public static void main(String[] args) {

        bitCountByte(Byte.MAX_VALUE);
        bitCountShort(Short.MAX_VALUE);
        bitCountInt(Integer.MAX_VALUE);
        bitCountLong(Long.MAX_VALUE);
    }

    public static void bitCountInt(int num) {
        int bitcounter = 1;

        while (num != 0) {
            num = num >> 1;
            bitcounter++;
        }
        System.out.println("Number of bits for int type:" + bitcounter);
    }

    public static void bitCountByte(byte num) {
        int bitcounter = 1;

        while (num != 0) {
            num = (byte) (num >> 1);
            bitcounter++;
        }
        System.out.println("Number of bits for byte type:" + bitcounter);

    }

    public static void bitCountShort(short   num) {
        int bitcounter = 1;

        while (num != 0) {
            num = (short) (num >> 1);
            bitcounter++;
        }
        System.out.println("Number of bits for short type:" + bitcounter);

    }

    public static void bitCountLong(long num) {
        int bitcounter = 1;

        while (num != 0) {
            num =  num >> 1;
            bitcounter++;
        }
        System.out.println("Number of bits for long type:" + bitcounter);

    }
}


