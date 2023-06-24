package com.atharva;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4, 56, 87, 23, 45, 65);
//        fun();
        multiple(2, 3, "Atharva", "Rahul", "jhfjhdkk");
    }

    static void multiple(int a, int b, String... v) {

    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
