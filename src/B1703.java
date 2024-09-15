import java.util.*;
import java.io.*;
public class B1703 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i) {
            int points = 0;
            HashSet set = new HashSet();
            st = new StringTokenizer(br.readLine());
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); ++j) {
                //pw.println(s.charAt(j));
                if (set.contains(s.charAt(j))) {
                    points+=1;
                }
                else{
                    set.add(s.charAt(j));
                    points+=2;
                }
                //pw.println(points);
            }
            pw.println(points);
        }
        pw.close();
    }
}
