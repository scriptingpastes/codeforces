import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class C1398Retry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tests; i++) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split("")).mapToInt(n -> Integer.parseInt(n)).map((m) -> m-1).toArray();
            HashMap<Integer, Long> map = new HashMap();
            int[] dp = new int[arr.length+1];
            dp[0] = 0;
            for (int j = 1; j <= arr.length; ++j){
                dp[j] = dp[j-1] + arr[j-1];
            }
            for (int k = 0; k < dp.length; ++k){
                if (map.containsKey(dp[k])){
                    map.replace(dp[k], map.get(dp[k])+1);
                }
                else{
                    map.put(dp[k], (long)1);
                }
            }
            long sum = 0;
            for (var entry : map.entrySet()){
                sum += (entry.getValue() * (entry.getValue()-1)) / 2;
            }
            System.out.println(sum);
        }
    }
}
