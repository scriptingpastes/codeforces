import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TreeSet;

public class C702 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        reader.readLine();
        int[] cities = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] cell = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        TreeSet<Integer> cells = new TreeSet(Arrays.stream(cell).boxed().toList());
        int cur_distance = Integer.MIN_VALUE;
        int max_distance = Integer.MIN_VALUE;
        for (int i : cities){
            if (cells.floor(i) == null){
                max_distance = Math.max(max_distance, Math.abs(i - cells.ceiling(i)));
            }
            else if (cells.ceiling(i) == null){
                max_distance = Math.max(max_distance, Math.abs(i - cells.floor(i)));
            }
            else {
                cur_distance = Math.min(Math.abs(i - cells.floor(i)), Math.abs(i - cells.ceiling(i)));
                max_distance = Math.max(cur_distance, max_distance);
            }
        }
        writer.println(max_distance);
        writer.flush();
    }
}
