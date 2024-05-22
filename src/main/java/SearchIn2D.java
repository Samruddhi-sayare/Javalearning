import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,2},
                {4,5,67,89},
                {3,6,76,43},
                {4,65,72,5}
        };
        int target = 3;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++){
                if (arr[i][j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1 , -1};
    }
}
