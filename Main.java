package com.hendricksonsarahl;

public class Main {

    public static void main(String[] args) {
        // Playing around with Java data types Byte, short, integer, and long
        // 1. Create a byte variable and set it to any valid byte number
        // 2. Create a short variable and set it to any valid short number
        // 3. Create an int variable and set it to any valid int number
        // 4. Create a variable of type long and make it equal to 50000 + 10 times the sum of the byte + short + int

        // Byte has a width of 8

        byte myByteValue = 12;
        byte myByteTotal = (byte) (myByteValue);
        System.out.println("myByteTotal = " + myByteTotal);

        // Short has a width of 16

        short myShortValue = 32;
        short myShortTotal = (short) (myShortValue);
        System.out.println("myShortTotal : " + myShortTotal);

        // int has a width of 32

        int myIntTotal = 10;
        System.out.println("myIntTotal = " + myIntTotal);

        // Long has a width of 64
        long myLongTotal = (long) 10 * (myByteTotal + myShortTotal + myIntTotal) + 50000;
        System.out.println("myLongTotal = " + myLongTotal);




    }
}
