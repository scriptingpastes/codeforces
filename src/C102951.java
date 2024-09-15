import java.util.*;
import java.io.*;
public class C102951 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i){
            b[i] = Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[n+1][n+1];
        for (int i = 0; i <= n; ++i){
            dp[i][0] = 0;
            dp[0][i] = 0;
        }
        for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j){
                if (a[i] == b[j]){
                    dp[i+1][j+1] = dp[i][j]+1;
                }
                else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        pw.println(dp[n][n]);
        pw.close();
    }
}
