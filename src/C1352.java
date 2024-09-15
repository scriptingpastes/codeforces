import java.util.*;
import java.io.*;
public class C1352 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int L = 0;
            int R = (int)1e10;
            int res = 0;
            while (L <= R){
                int mid = L + (R-L) / 2;
                if (mid - mid/n >= k){
                    if (mid % n != 0){
                        res = mid;
                    }
                    R = mid - 1;
                }
                else{
                    L = mid + 1;
                }
            }
            pw.println(res);
        }
        pw.close();
    }
}
