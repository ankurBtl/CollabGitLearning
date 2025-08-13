package com.ankur.misc;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial_Ankur(5));
    }
    public static long factorial_Ankur(int num){
        if(num==0){
            return 1;
        }
        return num * factorial_Ankur(num-1);
    }
}
