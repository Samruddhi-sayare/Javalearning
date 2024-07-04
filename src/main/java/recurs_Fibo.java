public class recurs_Fibo {
    public static void main(String[] args) {
        int count = 10;
//        System.out.println(n1+" "+n2);
        fibo(count-2);
    }
   static int n1=0,n2=1,n3=0;
    static void fibo(int count){
// 10 = 1+0=1 , 1+1=2 , 1+2=3 , 2+3=5, 3+5=8
        if (count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" "+n3);
            fibo(count-1);
        }
    }

}
