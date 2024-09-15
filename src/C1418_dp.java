import java.util.*;
import java.io.*;
public class C1418_dp {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int j = 0; j < n; ++j){
                a[j] = Integer.parseInt(st.nextToken());
                pw.println(Arrays.toString(a));
            }
            int[][] dp = new int[2][n+1];
            for (int j = 0; j < dp.length; ++j){
                for (int k = 0; k < dp[j].length; ++k){
                    dp[j][k] = Integer.MAX_VALUE;
                }
            }
        }
        pw.close();
    }
}
