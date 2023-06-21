//1. Write a program to print whether a number is even or odd, also take input from the user.

//Algorithm

//1. Start
//2. Input a number.
//3. if num % 2 == 0
//        print "Even"
//    else
//        print "Odd"
//4. End

package com.atharva;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}