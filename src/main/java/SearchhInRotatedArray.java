import java.util.Arrays;

public class SearchhInRotatedArray {
    public static void main(String[] args) {
          int[] arr  = {2,3,4,5,6,7,8,0,1,2};
        System.out.println(rotate(arr));
    }
    static int rotate(int[] arr){
       //pivot = largest number in the array
        int start = 0;
        int end = arr.length - 1;
        while (start <= end ){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }  if (arr[mid] <= arr[start]) {
                end = mid -1;
            }else {
                start = mid -1;
            }

        }
        return -1;
       }
}
