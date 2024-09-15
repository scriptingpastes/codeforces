import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class A268 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        int x = Integer.parseInt(reader.readLine());
        HashMap<Integer, Integer> map1 = new HashMap();
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < x; ++i){
            int[] a = Arrays.stream(reader.readLine().split(" ")).mapToInt(n->Integer.parseInt(n)).toArray();
            if (map1.containsKey(a[0])){
                map1.replace(a[0], map1.get(a[0])+1);
            }
            else{
                map1.put(a[0], 1);
            }
            arr.add(a[1]);
        }
        int count = 0;
        for (int j = 0; j < arr.size(); ++j){
            if (map1.containsKey(arr.get(j))){
                count+=map1.get(arr.get(j));
            }
        }
        writer.println(count);
        writer.flush();
    }
}
