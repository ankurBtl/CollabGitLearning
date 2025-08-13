package com.ankur.misc;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial_Ankur(5));
        System.out.println(factorial_Apoorva(4));
    }
    public static long factorial_Ankur(int num){
        if(num==0){
            return 1;
        }
        return num * factorial_Ankur(num-1);
    }
    public static long factorial_Apoorva(int num){
        int fact = 1;
        for(int i=1; i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
