public class Reverse_int {
    public static void main(String[] args) {
        revInt(7668);
    }
    static void revInt(int num){
       int sum = 0;
       while (num > 0){
           int rem = num % 10;
            sum = sum*10+rem;
           num = num / 10;

       }
        System.out.println(sum);

    }


}
