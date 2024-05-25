public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {-32,-22,0,3,4,5,32,65,89,90};
        int target = 65;
        int ans = BinarySear(arr,target);
        System.out.println(ans);
    }
    static int BinarySear(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ( end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;

    }

}
