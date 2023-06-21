//2. Take name as input and print a greeting message for that particular name.

//Algorithm

//1. Start
//2. Input a name.
//3. print Hello and All the best {name}
//4. End

package com.atharva;

import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name : ");
        String name = sc.nextLine();
        System.out.println("Hello and All the best " + name + "!");

    }
}
