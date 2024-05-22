public class searchInRange {
    public static void main(String[] args) {
         int[] arr = {2,3,4,1,6,8};
         int target = 2 ;
        System.out.println(range(arr, target,1,4));
    }
    static int range(int[] arr,int target, int start , int end){


        for (int i = start; i < end;i++){
            int element = arr[i];
            if (target == element){
                return i;
            }

        }
        return -1;
    }
}
