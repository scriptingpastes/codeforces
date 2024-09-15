import java.util.*;
import java.io.*;
public class C687 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] c = new int[n];
        for (int i = 0; i < n; ++i){
            c[i] = Integer.parseInt(st.nextToken());
        }
        boolean[][] dp = new boolean[k+1][k+1];
        dp[0][0] = true;
        for (int i = 0; i < c.length; ++i){
            for (int j = k; j >= 0; --j){
                if (j - c[i] >= 0){
                    for (int l = j-c[i]; l >= 0; --l){
                        if (dp[j-c[i]][l]){
                            dp[j][l+c[i]] = true;
                            dp[j][l] = true;
                        }
                    }
                }
            }
        }
        Vector<Integer> ans = new Vector();
        for (int i = 0; i <= k; ++i){
            if (dp[k][i]){
                ans.add(i);
            }
        }
        pw.println(ans.size());
        for (int numb : ans){
            pw.print(numb + " ");
        }
        pw.close();
    }
}
