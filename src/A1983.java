import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class A1983 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int[] arr = IntStream.iterate(1, q -> q+1).limit(k).toArray();
            pw.println();
            for (int j = 0; j <  arr.length; ++j){
                pw.print(arr[j] + " ");
            }
        }
        pw.close();
    }
}
