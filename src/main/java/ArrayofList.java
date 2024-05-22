import java.util.Scanner;
import java.util.ArrayList;
public class ArrayofList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(23);
        list.add(44);
        list.add(22);
        list.add(98);
        list.add(78);
        list.add(35);
        list.add(98);
        list.add(45);
        System.out.println(list.contains(56));
        list.remove(1);
        System.out.println(list);
//        for (int i = 0; i < 10; i++) {
//            sc.nextInt();
//        }

    }
}
