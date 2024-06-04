public class SeachInMountain {
    public static void main(String[] args) {
          int[] arr= {1,2,3,4,5,3,1};
          int target =6;
          int ans = SearchInt(arr,target);
        System.out.println(ans);
    }
    static int SearchInt(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
