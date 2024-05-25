import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
     int[] arr = {37,3,1,4,5,66,54,23,11,67,9,56};
       ascending(arr);
        sort(arr);
//        System.out.println(sorting(arr,9));
    }
    static void  ascending(int[] arr){
        System.out.println("unsorted array: ");
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }
    static void sort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));



    }
}
