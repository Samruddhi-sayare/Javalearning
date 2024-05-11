import java.util.Scanner;
public class Example_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n = sc.next().trim().charAt(0);

        if (n >= 'a' && n <= 'z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }
    }
}
