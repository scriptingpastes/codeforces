import java.util.*;
import java.io.*;
public class D1225 {
    static int gcd(int a, int b){
        if ( b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
    static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //idk how to do!!!
        pw.close();
    }
}
