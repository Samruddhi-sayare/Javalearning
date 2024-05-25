public class Palidrome {
    public static void main(String[] args) {
         palidro(3526);
//        System.out.println(ans);
    }
    //palindrome number = 22 , 151 , 34543 ,etc

    static int palidro(int num){
        int sum = 0;

        int orignal =  num;
        while (num > 0){
            int rem = num % 10; // 141 % 10 = 1 , // 14 % 10 = 4
            sum = sum*10+rem; // 1 , // 10 + 4 = 14,
            num = num / 10; //   141 / 10 =  14.1 ,
        }
//        System.out.println(sum);
//        System.out.println();
        if (sum == orignal){
            System.out.println("palindrome number");
        }else {
            System.out.println("non palidrome number");
        }
        return -1;
    }


}
