import java.util.Scanner;
public class Example_33 {
    public static void main(String[] args) {
        sum();
        sum();
        mul();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int a , b ,c ;
        a = sc.nextInt();
        System.out.println("enter the first number: " + a);
        b = sc.nextInt();
        System.out.println("Enter the second number :"+ b);
        c =  a + b;
        System.out.println(c);
    }
    static void mul(){
        Scanner sc = new Scanner(System.in);
        int a , b ,c ;
        a = sc.nextInt();
        System.out.println("enter the first number: " + a);
        b = sc.nextInt();
        System.out.println("Enter the second number :"+ b);
        c =  a * b;
        System.out.println("the multiplication of two number :"+c);
    }
}
