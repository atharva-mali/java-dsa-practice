package com.atharva;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        //float is greater than int
//        int num=input.nextInt();
//        System.out.println(num);

        //Type Casting
        int num = (int) (67.54f);
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); //257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);


//        System.out.println(b);


//        byte b = 50;
//        b = b * 2;
        int number = 'A';
//        System.out.println("你好");
        //Type promotion rules
//        System.out.println(3 * 5.6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        //float + int - double = double
        System.out.println(result);

    }
}
