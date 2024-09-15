import java.util.*;
import java.io.*;
public class A1989 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            if (Integer.parseInt(st.nextToken()) <= -2){
                pw.println("NO");
            }
            else{
                pw.println("YES");
            }
        }
        pw.close();
    }
}
