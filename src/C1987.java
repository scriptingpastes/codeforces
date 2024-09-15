import java.util.*;
import java.io.*;
public class C1987 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int[] arr = new int[t];
            st = new StringTokenizer(br.readLine());
            int max = 0;
            for (int j = 0; j < t; ++j){
                arr[j] = Integer.parseInt(st.nextToken());
                max = Math.max(arr[j], max);
            }
            int counter = 0;
            while (arr[0] != 0) {
                counter++;
                for (int j = 0; j < arr.length; ++j) {
                    if (j == t - 1 || arr[j] > arr[j + 1]) {
                        arr[j] -= 1;
                    }
                }
            }
            pw.println(counter);
        }
        pw.close();
    }
}
