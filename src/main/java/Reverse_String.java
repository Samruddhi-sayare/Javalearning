public class Reverse_String {
    public static void main(String[] args) {
        Reverse("SAMRUDDHI");

    }
    static void Reverse(String name){
        String rstr = " ";
        for (int i = 0; i < name.length(); i++) {
            char str = name.charAt(i);
            rstr = str + rstr;
        }
        System.out.println(rstr);
    }
}
