import java.util.*;
import java.io.*;
public class C1359 {
    static boolean flag = false;
    public static double works(double mid, int a, int b, int c){
        double avg = (((a*(mid+1)) + (b*mid)) / ((2*mid)+1));
        //System.out.println(avg);
        return Math.abs(avg-c);
    }
    public static int solve(int a, int b, int c){
        if (((a + b) / 2) >= c){
            return 2;
        }
        int L = 0;
        int R = (int) 1e6;
        int ans = 0;
        while (L <= R){
            int mid = L + (R-L)/2;
            if (works(mid, a, b, c) + 0.00000000001 <= works(mid+1, a, b, c)){
                R = mid - 1;
                ans = mid;
            }
            else{
                L = mid + 1;
            }
        }
        return (ans*2)+1;
    }
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
            pw.println(solve(a,b,c));
        }
        pw.close();
    }
}
