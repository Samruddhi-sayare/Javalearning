import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {2,3,4,5,6},
                {61,64,24,12},
                {34,62,28}
        };
        System.out.println(Arrays.toString(search(arr,3)));
    }
static int[] search(int[][] matrix , int target){
        int r = 0;
        int c = matrix.length - 1;
        while (r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c] < target){
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1 , -1};
}
}

