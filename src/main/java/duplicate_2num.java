import java.util.ArrayList;
import java.util.List;

public class duplicate_2num {
    public static void main(String[] args) {

    }
    public List<Integer> duplict(int [] arr){

            int i = 0;
            while (i < arr.length ){
                int correct  = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr , i ,correct);
                }else {
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j+1);{
                    ans.add(arr[j] );
                }
            }
            return ans;
        }


    static void swap(int [] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = arr[first];
    }
}
