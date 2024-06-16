import java.util.Arrays;

public class Median {
    public static void main(String[] args) {

        int []arr1 = {1,2,3,4,5,6,7};
        int []arr2 = {4,6,7,9};

        int i = arr1.length;
        int j = arr2.length;

        int []arr3 =new int[i + j];
//        System.out.println(arr3);

//         Merge two array into one array
        System.arraycopy(arr1, 0, arr3, 0, i);
        System.arraycopy(arr2, 0, arr3, i, j);

//         Sort the merged array
        Arrays.sort(arr3);


        System.out.println(Arrays.toString(arr3));

//        System.out.println(Arrays.toString(median(arr3)));
    }
     static int median( int []arr3){
        int start = 0;
        int end = arr3.length-1;
        for (int i = 0; i < arr3.length; i++) {
            int mid = start + end/ 2;
          return mid;
        }

        return -1;
    }


}
