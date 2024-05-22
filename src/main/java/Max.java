public class Max {
    public static void main(String[] args) {
        int[] arr= {1,2,34,54,21,11};
        System.out.println(maxi(arr , 0,2));
    }
//    static int maxi(int[] arr){
//        int maxval = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maxval){
//                maxval = arr[i];
//            }
//
//        }

    static int maxi(int[] arr, int start , int end){
        int maxval = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval){
                maxval = arr[i];
            }

        }

        return maxval;
    }
}
