import java.util.*;
import java.io.*;
public class B1992 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[k];
            int count = 0;
            for (int j = 0; j < k; ++j){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; ++j){
                if (j != arr.length-1){
                    count += arr[j]-1+arr[j];
                }
            }
            pw.println(count);
        }
        pw.close();
    }
}
