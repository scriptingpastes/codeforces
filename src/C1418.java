import java.util.*;
import java.io.*;

public class C1418 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            int[] dp = new int[n];
            for (int j = 0; j < n; ++j) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            int idx = 0;
            boolean friends_turn = true;
            while (idx < n){
                if (friends_turn){
                    if (a[idx] == 0 && a[idx+1] == 0){
                        if (idx == 0){
                            dp[idx] = 0;
                        }
                        else{
                            dp[idx] = dp[idx-1];
                        }
                        idx+=2;
                    }
                    else if (a[idx] == 1 && a[idx+1] == 0){
                        if (idx == 0){
                            dp[idx] = 1;
                        }
                        else{
                            dp[idx] = dp[idx-1]+1;
                        }
                        idx+=2;
                    }
                    else{
                        if (idx == 0){
                            dp[idx] = 1;
                        }
                        else{
                            dp[idx] = dp[idx-1]+2;
                        }
                        idx++;
                    }
                    friends_turn = false;
                }
                else{
                    if (a[idx] == 1 && a[idx+1] == 1){
                        dp[idx] = dp[idx-1];
                        idx+=2;
                        friends_turn = true;
                    }
                    else{
                        
                    }
                }
            }
        }
    }
}
