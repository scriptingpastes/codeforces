import java.util.*;
public class A1182 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = Integer.parseInt(sc.nextLine());
        long[] dp = new long[61];
        dp[1] = 0;
        dp[0] = 1;
        for (int i = 2; i <= 60; i++){
            dp[i] = dp[i-2] * 2;
        }
        System.out.println(dp[numb]);
    }
}
