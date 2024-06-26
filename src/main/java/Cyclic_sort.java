import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int [] arr = {1,5,3,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[correct] != arr[i]){
                swap(arr, i , correct);
            }
            else {
                i++;
            }
        }
    }

     static void swap(int [] arr , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
