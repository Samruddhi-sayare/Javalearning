import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
int []arr = {2,4,5,1,0};
insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j++) {
                if (arr[j] < arr[j-1]){
                   Swap.swap(arr , j , j-1);
                }else {
                    break;
                }
            }
        }
    }
}
