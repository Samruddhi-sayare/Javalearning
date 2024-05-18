public class Example_36 {
    public static void main(String[] args) {
      swap(20,10);
    }
    static void swap(int a , int b ){
        int temp ;
        temp = a ;
        a = b;
        b = temp ;
        System.out.println(a);
        System.out.println(b);
    }
}
