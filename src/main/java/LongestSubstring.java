public class LongestSubstring {
    public static void main(String[] args) {
    int ans = longeststring("SAMRI");
        System.out.println(ans);
    }
    static int longeststring(String name){
        int res = 0;
        for (int i = 0; i < name.length(); i++) {
            boolean [] variable = new boolean[256];
            for (int j = i; j < name.length() ; j++) {
                if (variable[name.charAt(j)] == true)
                    break;
                else {
                    res = Math.max(res,j-i+1);
                    variable[name.charAt(j)] = true;
                }
            }
            variable[name.charAt(i)] = false;
        }
            return res;
    }

}
