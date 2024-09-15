import java.io.*;
import java.util.*;
public class B1989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            st = new StringTokenizer(br.readLine());
            String b = st.nextToken();
            char[] as = a.toCharArray();
            char[] bs = b.toCharArray();
            int max = 0;
            int counter = 0;
            for (int k = 0; k < bs.length; ++k) {
                int p = k;
                counter = 0;
                for (int j = 0; j < as.length; ++j) {
                    if (bs[p] == as[j]) {
                        p++;
                        counter++;
                        if (p == bs.length){
                            break;
                        }
                    }
                }
                max = Math.max(max, counter);
            }
            pw.println(as.length + bs.length - max);
        }
        pw.close();
    }
}
