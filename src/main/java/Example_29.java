import java.util.Scanner;
public class Example_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits = sc.next();

         switch (fruits){
             case "mango":
                 System.out.println("A king of fruits");
                 break;
             case " apple":
                 System.out.println("red fruit");
                 break;
             case "orange":
                 System.out.println("round");
                 break;
             default:
                 System.out.println("please enter a valid fruit");
         }

    }
}
