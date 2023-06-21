//3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

//Algorithm

//1. Start
//2. Input principal.
//3. Input time.
//4. Input rate.
//5. si = p * r * t
//6. amt = p + si
//7. print si and amt.

package com.atharva;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal : ");
        long p = sc.nextLong();

        System.out.print("Enter Rate : ");
        float r = sc.nextFloat();

        System.out.print("Enter Time : ");
        int t = sc.nextInt();

        double si = p * r * t / 100;
        double amt = p + si;

        System.out.println("Simple Interest : " + si);
        System.out.println("Total Amount : " + amt);
    }
}
