import java.util.*;
import java.io.*;
public class A1987 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            if (k == 1){
                pw.println(n);
            }
            else{
                pw.println( n * k - (k - 1));
            }
        }
        pw.close();
    }
}
