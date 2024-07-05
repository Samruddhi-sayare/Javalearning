package com.sam;

public class recurs_sum {
    public static void main(String[] args) {
   int b = sum(4);
        System.out.println(b);
    }
   static int sum( int num){
        if ( num%10 == num){
            return num;
        }
        return (num%10) * sum(num/10);
   }
}
