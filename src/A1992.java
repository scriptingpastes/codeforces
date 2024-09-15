import java.util.*;
import java.io.*;
public class A1992 {
    static int res = 1;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int[] arr = new int [] {a, b, c};
            int x = 5;
            while (x > 0){
                Arrays.sort(arr);
                arr[0]+=1;
                x--;
            }
            Arrays.stream(arr).forEach(n -> res*=n);
            pw.println(res);
            res = 1;
        }
        pw.close();
    }
}
