package com.atharva;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4, 56, 87, 23, 45, 65);
//        fun();
//        multiple(2, 3, "Atharva", "Rahul", "jhfjhdkk");
//        demo();
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {

    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
