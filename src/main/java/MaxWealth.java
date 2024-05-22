public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc = {
                {2,3,4},
                {3,1,3}
        };
        System.out.println(maxiwealt(acc));
    }
    static int maxiwealt(int[][] acc){
        int ans = Integer.MAX_VALUE;
        for (int person = 0; person < acc.length; person++){
             int sum= 0;
            for (int account = 0 ; account < acc[person].length; account++){
                sum += acc[person][account];
            }
//             if (sum >  ans){
//                 ans = sum;
//             }
        }
        return ans;
    }
}
