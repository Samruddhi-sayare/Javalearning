
public class Armstrong {
    public static void main(String[] args) {
        armstrong(267);
    }
    static void armstrong(int num){
        int original = num ;
        int sum = 0;
        while (num > 0){
            int rem = num % 10 ;
            num = num / 10 ;
            sum = sum + rem*rem*rem;

        }
        System.out.println(sum);
        if (sum == original){
            System.out.println("the given number is armstrong");
        }
        else {
            System.out.println("the number is non armstrong");
        }
    }
}
