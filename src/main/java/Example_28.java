import java.util.Scanner;
public class Example_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int num = 3242;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
