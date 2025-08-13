package com.ankur.misc;

public class Loop {

    public static void main(String[] args) {
        System.out.println(loopSum(4));
    }
    public static int loopSum(int num){
        int sum=0;
        for (int i = 0; i<=num; i++) {
            sum+=i;
        }return sum;
}
}
