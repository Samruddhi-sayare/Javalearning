import java.util.Scanner;

import java.util.Scanner;

public class Example_21 {
    public static void main(String[] args) {
//    for (int num = 1 ; num <= 5 ; num+=2){
//        System.out.println(num);
//    }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int num = 1 ; num <= n ; num ++){
////            System.out.println(num +" ");
//            System.out.println("hello");
//        }
//        int num = 1 ;
//        while (num <= 5){
//            System.out.println("hello");
//            num++;
//        }
        int salary = 34000;
        if (salary > 10000){
            salary = salary + 2000;
        } else if (salary > 20000) {
            salary += 3000;
        }
        System.out.println(salary);


    }
}
