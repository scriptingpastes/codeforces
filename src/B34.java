import java.util.*;
import java.io.*;
public class B34 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken()); int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int sum = 0; int max = 0;
        for (int j = 0; j < m; ++j){
            sum += a[j];
            max = Math.min(max, sum);
        }
        pw.println(max*-1);
        pw.flush();
    }
}
