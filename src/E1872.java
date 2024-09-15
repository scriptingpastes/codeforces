import java.util.*;
import java.io.*;

public class E1872 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int[] pre = new int[n+1];
            pre[0] = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a.length; ++j){
                a[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 1; j < pre.length; ++j){
                pre[j] = pre[j-1]^a[j-1];
            }
            st = new StringTokenizer(br.readLine());
            int x0 = 0;
            int x1 = 0;
            int[] s = Arrays.stream(st.nextToken().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < s.length; ++j){
                if (s[j] == 1){
                    x1^=a[j];
                }
                else{
                    x0^=a[j];
                }
            }
            st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            for (int j = 0; j < q; ++j){
                st = new StringTokenizer(br.readLine());
                int querie = Integer.parseInt(st.nextToken());
                if (querie == 2){
                    int g = Integer.parseInt(st.nextToken());
                    if (g == 1){
                        pw.print(x1 + " ");
                    }
                    else{
                        pw.print(x0 + " ");
                    }
                }
                else{
                    int l = Integer.parseInt(st.nextToken());
                    int r = Integer.parseInt(st.nextToken());
                    x0 ^= pre[r]^pre[l-1];
                    x1 ^= pre[r]^pre[l-1];
                }
            }
            pw.println();
        }
        pw.close();
    }
}
