import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C1982 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int j = 0; j < n; ++j){
                a[j] = Integer.parseInt(st.nextToken());
            }
            int pointer; int sum = 0; int counter = 0;
            for (int k = 0; k < a.length; ++k){
                pointer = k+1;
                sum += a[k];
                while (sum < l && pointer != a.length){
                        sum += a[pointer];
                        pointer++;
                }
                if (sum >= l && sum <= r){
                    counter++;
                    k = pointer-1;
                }
                sum = 0;
            }
            pw.println(counter);
        }
        pw.flush();
    }
}
