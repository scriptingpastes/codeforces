import java.util.*;
import java.io.*;
public class B102951 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; ++i){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int sum = 0; int counter = 0;
        for (int j : a){
            if (sum + j <= x){
                counter++;
                sum+=j;
            }
        }
        pw.println(counter);
        pw.flush();
    }
}
