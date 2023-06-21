package com.atharva;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)
                ;
        System.out.print("Enter first number : ");
        float num1 = s.nextFloat();

        System.out.print("Enter second number : ");
        float num2 = s.nextFloat();

        float sum = num1 + num2;
        System.out.println("Sum = " + sum);

    }
}
