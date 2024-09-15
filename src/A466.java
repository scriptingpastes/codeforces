import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class A466 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        int[] arr = Arrays.stream(reader.readLine().split(" ")).mapToInt(n->Integer.parseInt(n)).toArray();
        int n = arr[0];
        int m = arr[1];
        int a = arr[2];
        int b = arr[3];
        if (b >= m * a){
            writer.println(n*a);
        }
        else{
            writer.println((n / m) * b + Math.min((n%m) * a, b));
        }
        writer.flush();
    }
}
