import javax.sound.midi.Soundbank;
import javax.sound.sampled.EnumControl;

public class EvenDigts {
    public static void main(String[] args) {
         // find even no. of digits
         int[] arr = {23,124,55,1346,664,54};
        System.out.println(cout(arr));
        System.out.println(digits(232));
    }
    static int cout(int[] arr){
        int count = 0;
        for (int num : arr){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numofdig = digits(num);
        return numofdig % 2 == 0;
    }
    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

}
