public class Search_one {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,1,2,4,3};
        int sum = seearch(arr);
        System.out.println(sum);
    }
    static int seearch(int [] arr){
       int unique = 0;
       for (int n : arr){
           unique ^= n;
       }
       return unique;
    }

}
