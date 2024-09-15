import java.util.*;
import java.io.*;
public class B1987 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            int a  = Integer.parseInt(st.nextToken());
            int[] arr = new int[a];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; ++j){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int L = 0;
            int R = 1;
            long res = 0;
            int max = 0;
            while (R < arr.length){
                if (arr[L] > arr[R]){
                    res += arr[L] - arr[R];
                    max = Math.max(max, arr[L] - arr[R]);
                }
                else if (arr[L] <= arr[R]){
                    L = R;
                }
                R++;
            }
            pw.println(res + max);
        }
        pw.close();
    }
}
