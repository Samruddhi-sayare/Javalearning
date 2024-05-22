public class Linear_Search{
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6,4,23,42,45,523,3,4,53};
        int target = 53 ;
        int ans = linear(arr,target);
        System.out.println(ans);
    }
        static int linear(int[] arr,int target){
            if (arr.length == 0){
                return -1;
            }
            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (element == target){
                    return i;
                }
            }
            return -1;
        }
}