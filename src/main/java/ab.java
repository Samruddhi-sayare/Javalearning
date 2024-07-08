public class ab {
    public static void main(String[] args) {

        System.out.println( zero(230590));
    }
    static int c = 0 ;
    static int zero(int num){
       return help(num , 0);
    }

    private static int help(int num , int c) {
        if (num == 0){
            return c;
        }
        int rem = num % 10 ; // 0
        if (rem==0){
            return help(num / 10 , c+1);
        }
        return help(num / 10 , c);
    }
}
