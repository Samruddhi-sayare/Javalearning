import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int arr[]= new int[10];
        Scanner sc = new Scanner(System.in);

        // using for loopps
        for (int n = 0 ; n < arr.length; n++){
            arr[n] = sc.nextInt();
            System.out.print(arr[n]+ " ");
        }
    }
}
