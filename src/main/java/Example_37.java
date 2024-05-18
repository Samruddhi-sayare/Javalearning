import java.util.Arrays;

public class Example_37 {
    public static void main(String[] args) {
        // array - collection of string , int , etc
        int[] arr = {3,4,5,32,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0] = 99;
        num[3] = 43 ;

    }
}
