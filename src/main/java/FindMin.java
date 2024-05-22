public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23,45,53,17,-43,60};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int minval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minval > arr[i] ){
                minval = arr[i];
            }
        }
        return minval;
    }

}
