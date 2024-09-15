import java.util.*;
import java.io.*;
public class D1992 {
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
            st = new StringTokenizer(br.readLine());
            String river = st.nextToken();
            int temp = m;
            for (int j = 0; j < n; ++j){
                if (river.charAt(j) == 'L'){
                    while (river.charAt(j+temp) == 'W'){
                        temp--;
                    }
                    if(river.charAt(j+temp) == 'L'){
                        j+=temp;
                    }
                    else{
                        if (temp >= k){
                            pw.println("NO");
                        }
                    }
                }
            }
            pw.println("YES");
        }
        pw.close();
    }
}