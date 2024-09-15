import java.util.*;
import java.io.*;
public class F977 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; ++i) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; ++i){
            if (m.containsKey(a[i]-1)){
                m.put(a[i], m.getOrDefault(a[i]-1, 1)+1);
            }
            else{
                m.put(a[i], 1);
            }
        }
        int max = 0;
        int numb = 0;
        for (var i : m.entrySet()){
            int val = i.getValue();
            if (val > max){
                max = val;
                numb = i.getKey();
            }
        }
        pw.println(max);
        //pw.println(numb);
        for (int i = 0; i < n; ++i){
            if (max > 0) {
                if (a[i] == numb - max + 1){
                    pw.print(i + 1 + " ");
                    max--;
                }
                //pw.print(numb - max + 1);
            }
        }
        pw.close();
    }
}
