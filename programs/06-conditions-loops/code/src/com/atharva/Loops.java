package com.atharva;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            Syntax of for loop

            for(initialisation; condition; increment/decrement){
                //body
            }
         */

        //Q. Print numbers from 1 to 5

//        for (int num = 1; num <= 5; num += 2) {
//            System.out.println(num);
//        }

        //Print numbers from 1 to n
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();

//        for (int num = 1; num <= n; num++) {
////            System.out.print(num + " ");
//            System.out.println("Hello World!");
//        }

        //while loop
        /*
            Syntax
            while(condition){
                //body
            }
         */
        int num = 1;
        while (num <= 5) {
//            System.out.println(num);
            num++;
        }

        //do-while
        /*
            do{
                //body
            }while(condition)
         */
        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);
    }
}
