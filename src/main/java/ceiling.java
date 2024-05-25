public class ceiling {
    public static void main(String[] args) {
        // smallest element in array greater or equal == target
        int[] arr = {2,3,4,6,8,9,11,14};
        int target = 5;
        int ans = ceil(arr,target);
        System.out.println(ans);


    }
    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length -1 ;
        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }

        }
//        if (target != ceil(arr, target)){
//            System.out.println(target++);
//        }
        return start;

    }
}
