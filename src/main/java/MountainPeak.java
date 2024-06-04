public class MountainPeak {
    public static void main(String[] args) {
        int[]arr = {0,1,0};
        int ans = Peak(arr);
        System.out.println(ans);
    }
    static int Peak(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > arr[i+1]){
                return i;
            }
        }
        return -1;
    }
}
//int [] arr = {0,1,3,4,6,4,2}
//for(int i=0 ; i<arr.length ; i++
