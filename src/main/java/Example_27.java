import java.util.Scanner;
public class Example_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 35578;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == 9){
                count ++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
