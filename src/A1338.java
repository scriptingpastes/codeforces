import java.util.*;
import java.io.*;
public class A1338 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int max_diff = 0;
            for (int j = 0; j < arr.length; ++j){
                for (int k = j+1; k < arr.length; ++k){
                    if (arr[k] < arr[j]){
                        max_diff = Math.max(max_diff, arr[j]-arr[k]);
                    }
                    else{
                        break;
                    }
                }
            }
            int counter = 0;
            while (max_diff >= 1){
                max_diff>>=1;
                counter++;
            }
            pw.println(counter);
        }
        pw.close();
    }
}
