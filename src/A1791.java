import java.util.*;
import java.io.*;
public class A1791 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        String x = "codeforces";
        String[] arr = x.split("");
        Set s = new HashSet(List.of(arr));
        for (int i = 0; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            String y = st.nextToken();
            if (s.contains(y)){
                pw.println("YES");
            }
            else{
                pw.println("NO");
            }
        }
        pw.close();
    }
}
