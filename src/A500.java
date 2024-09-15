import java.util.*;
import java.io.*;
public class A500 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        arr[0] = 1;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; ++i){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int j = 1; j <= arr.length; ++j){
            j += arr[j-1] - 1;
            if (j == t){
                pw.println("YES");
                pw.close();
                System.exit(0);
            }
        }
        pw.println("NO");
        pw.close();
    }
}
