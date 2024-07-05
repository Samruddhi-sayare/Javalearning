package com.sam;

public class Steps {
    public static void main(String[] args) {
int a = step(14);
        System.out.println(a);
    }
    static int step(int n){
        return helper(n , 0);
    }

    private static int helper(int n, int c) {
        if (n == 0){
            return c;
        }
        if (n % 2 == 0){
            return helper(n/2 ,c+1);
        }
        return helper(n-2,c+2);
    }
}
