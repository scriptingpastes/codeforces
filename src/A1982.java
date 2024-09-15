import java.io.*;
import java.util.*;
public class A1982 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int s_b = Integer.parseInt(st.nextToken());
            int s1_b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int s_a = Integer.parseInt(st.nextToken());
            int s1_a = Integer.parseInt(st.nextToken());
            if (s_b > s1_b){
                if (s1_a > s_a){
                    pw.println("NO");
                }
                else{
                    pw.println("YES");
                }
            }
            if (s1_b > s_b){
                if (s_a > s1_a){
                    pw.println("NO");
                }
                else{
                    pw.println("YES");
                }
            }
        }
        pw.flush();
    }
}
