import java.util.*;
import java.io.*;

import static java.util.Comparator.reverseOrder;

public class A149 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int k = Integer.parseInt(st.nextToken());
        int[] months = new int[12];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 12; ++i){
            months[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(months);
        int sum = 0;
        int counter = -1;
        for (int i = months.length-1; i > -1; --i){
            sum+=months[i];
            if (sum >= k){
                counter++;
                break;
            }
            counter++;
        }
        if (k == 0){
            pw.println(0);
        }
        else{
            pw.println(counter + 1);
        }
        pw.close();
    }
}
