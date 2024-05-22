public class LinearString {
    public static void main(String[] args) {
        String a ="samruddhi";
        char target = 'z';
        System.out.println(search(a,target));
    }
    static boolean search(String str,char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
