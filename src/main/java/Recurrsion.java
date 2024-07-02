public class Recurrsion {
    public static void main(String[] args) {
        recur(1);
    }
   static void recur(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        recur(n+1);
    }
}
