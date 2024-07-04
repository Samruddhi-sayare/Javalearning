public class recurs_array {
    public static void main(String[] args) {
        int [] arr= {1,2,4,5,7,3};
        System.out.println(array(arr, 0));
    }
    static boolean array(int [] arr, int index){
         if (index == arr.length - 1){
             return true;
         }
         return arr[index] < arr[index + 1] && array(arr , index +1);
        }
}
