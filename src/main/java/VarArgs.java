import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,4,42,2,45,2,5,3,2,4);
        multiple(2,5,4,4,3,2);

        int mul = sum(5,2);
        System.out.println(mul);
    }
    static void multiple(int a , int b , int ...v){
        System.out.println(a+b);
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static int sum(int a , int b){

        return a * b ;
    }
}
