import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
import java.util.*;
public class C1992 {
    static ArrayList<Integer> arrs;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arrs = new ArrayList();
            IntStream.iterate(n, q -> q-1).limit(n).forEach(y->arrs.add(y));
            Collections.reverse(arrs.subList(arrs.indexOf(m), arrs.size()));
            arrs.forEach(u -> pw.print(u + " "));
            pw.println();
        }
        pw.close();
    }
}