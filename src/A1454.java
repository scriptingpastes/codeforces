import java.util.*;
import java.io.*;
public class A1454 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if (x == 2){
                pw.println(2 + " " + 1);
            }
            else{
                pw.print(2 + " " + 3);
                int q = 4;
                while (q <= x){
                    pw.print(" " + q++);
                }
                pw.print(" " + 1);
                pw.println();
            }
        }
        pw.close();
    }
}
