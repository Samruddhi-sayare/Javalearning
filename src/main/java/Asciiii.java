import java.util.ArrayList;

public class Asciiii {
    public static void main(String[] args) {
        System.out.println(asci("" , "gdyegw"));

    }
    static ArrayList<String>  asci(String p , String ph){
            if (ph.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            char ch = ph.charAt(0);
            ArrayList<String> first = asci(p+ ch , ph.substring(1));
            ArrayList<String> second = asci(p, ph.substring(1));
            ArrayList<String> third = asci(p+ (ch+0) , ph.substring(1));
            first.addAll(second);
            first.addAll(third);

            return first;
    }
}
