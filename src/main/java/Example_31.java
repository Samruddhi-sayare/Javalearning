import java.util.Scanner;
public class Example_31 {
    public static void main(String[] args) {
        // int sum = 0;
        // input = 153;
        // int rem = input % 10 ;
        // rem = rem*rem*rem;
        // input = input / 10;
        // input++;
        int sum = 0 ;
        int n = 370;
        while (n > 0) {
            int rem = n % 10;

            n = n / 10;
            sum = sum + rem * rem * rem;

        }

        System.out.println(sum);

    }

}
