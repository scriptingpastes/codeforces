import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class E104002 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        PrintWriter writer = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int williams_score = 0;
        ArrayList<Integer> arr = new ArrayList();
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; ++i){
            arr.add(Integer.valueOf(st.nextToken()));
        }
        for (int j = 0; j < arr.size() - 1; ++j){
            if (arr.get(j) > arr.get(j+1)){
                williams_score+=arr.get(j);
                arr.remove(j);
                arr.remove(j);
            }
            else{
                williams_score+=arr.get(j+1);
                arr.remove(j);
                arr.remove(j);
            }
        }
        writer.println(williams_score);
        writer.flush();
    }
}
