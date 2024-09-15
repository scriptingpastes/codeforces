import java.util.*;
import java.io.*;
public class C1514 {
    static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList();
        long p = 1;
        arr.add(1);
        for (int i = 2; i < n-1; ++i){
            if (gcd(i, n) == 1){
                arr.add(i);
                p*=i;
                p%=n;
            }
        }
        if (p!=1){
            arr.add(n-1);
        }
        pw.println(arr.size());
        arr.forEach(e -> pw.print(e + " "));
        pw.close();
    }
}
