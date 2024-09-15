import java.util.*;
import java.io.*;
public class A43 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < n; ++i){
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            if (map.containsKey(x)){
                map.replace(x, map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        }
        int max_value = 0; String max_key = "";
        for (var key : map.keySet()){
            if (map.get(key) > max_value){
                max_value = map.get(key);
                max_key = key;
            }
        }
        pw.println(max_key);
        pw.flush();
    }
}
