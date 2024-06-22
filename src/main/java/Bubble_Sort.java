import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {
        int arr[] = {12,34,21,65,32,76,31};
        bubble(arr);
    }
    static void bubble(int []arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
