package com.ankur.misc;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial_Apoorva(4));
    }
    public static long factorial_Apoorva(int num){
        int fact = 1;
        for(int i=1; i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
