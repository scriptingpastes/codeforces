import java.util.*;
public class A189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        String x = sc.nextLine().trim();
        String[] a = x.split(" ");
        int[] b = Arrays.stream(a).mapToInt(n -> Integer.parseInt(n)).sorted().toArray();
        int[] dp = new int[target+1];
        dp[0] = 0;
        int q = Integer.MIN_VALUE, w = Integer.MIN_VALUE, e = Integer.MIN_VALUE;
        for (int i = 1; i < target+1; i++){
            if (i >= b[0]){
                q = dp[i-b[0]];
            }
            if (i >= b[1]){
                w = dp[i-b[1]];
            }
            if (i >= b[2]){
                e = dp[i-b[2]];
            }
            dp[i] = 1+Math.max(q, Math.max(w, e));
        }
        System.out.println(dp[target]);
    }
}
