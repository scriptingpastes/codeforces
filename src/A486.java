import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class A486 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        long numb = Long.parseLong(reader.readLine());
        if (numb % 2 == 0){
            writer.println(numb / 2);
        }
        else{
            writer.println((long)(Math.ceil(numb / 2.0) * -1));
        }
        writer.flush();
    }
}
