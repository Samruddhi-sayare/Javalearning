public class Example_18 {

    public static int reverse(int num){
        System.out.println("Original Number:"+num);
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10 +rem;
            num= num/10;
        }
        return rev;
    }
    public static void main(String[] args) {

        System.out.println("Reversed Number"+reverse(23597));
    }
}
