import java.util.Scanner;
public class Example_Queastions {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
           if (n % c == 0){
               return false;
           }
        }
        if (n >= c){
            return true;
        }
        else {
            return false;
        }

    }
}
