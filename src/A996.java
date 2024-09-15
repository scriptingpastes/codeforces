import java.util.*;
public class A996 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        /* //dp solution
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; ++i){
            if (i >= 100){
                dp[i] = dp[i-100] + 1;
            }
            else if (i >= 20){
                dp[i] = dp[i-20] + 1;
            }
            else if (i >= 5){
                dp[i] = dp[i-5] + 1;
            }
            else{
                dp[i] = dp[i-1] + 1;
            }
        }
        System.out.println(dp[n]);
         */
        int[] counts = {1,5,10,20,100}; int idx = counts.length-1; int counter = 0;
        while (n!=0){
            if (n >= counts[idx]){
                n-=counts[idx];
                counter++;
            }
            else{
                idx--;
            }
        }
        System.out.println(counter);
    }
}
