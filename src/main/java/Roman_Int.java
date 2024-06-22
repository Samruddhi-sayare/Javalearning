public class Roman_Int {
    public static void main(String[] args) {
        Roman_Int sc = new Roman_Int();
        String str = "XX";
        System.out.println(sc.romantodec(str));
    }
    int value(char r){
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    int romantodec(String str){
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if (i+1 < str.length()){
                int s2 = value(str.charAt(i+1));
                if (s1 >= s2){    //  IV = 1 - 5 = 4
                    res =res + s1;
                }
                else {
                    res = res + s2 -s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }

        }
        return res;
    }
}
