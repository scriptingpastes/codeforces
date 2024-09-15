import java.util.*;
import java.io.*;
public class F1851 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            ArrayList<List<Integer>> arr = new ArrayList();
            for (int j = 0; j < n; ++j){
                arr.add(List.of(Integer.parseInt(st.nextToken()), j+1));
            }
            Collections.sort(arr, (f,s) -> f.get(0) - s.get(0));
            int cur = 0;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n-1; ++j){
                if ((arr.get(j).get(0)^arr.get(j+1).get(0)) < min){
                    min = arr.get(j).get(0)^arr.get(j+1).get(0);
                    cur = j;
                }
            }
            pw.print((arr.get(cur).get(1) + " " + arr.get(cur+1).get(1)) + " ");
            pw.print((arr.get(cur).get(0) ^ ((1<<k)-1)) +"\n");
        }
        pw.close();
    }
}
