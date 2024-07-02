public class OddEven {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(idodd(n));
    }
    static boolean idodd(int n){
        return (n & 1) == 1;
    }
}
