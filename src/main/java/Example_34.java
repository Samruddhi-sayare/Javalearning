import java.util.Scanner;
public class Example_34 {
    public static void main(String[] args) {
        String message = greet("sannjnj");
        System.out.println(message);
    }
   static String greet(String name){
        String s = "hello" + name;
        return s;
   }

}
