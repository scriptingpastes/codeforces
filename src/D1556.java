import java.util.*;
import java.io.*;
public class D1556 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int ask(String s, int a, int b) throws Exception{
        System.out.printf("&s &d &d", s, a, b);
        System.out.flush();
        return Integer.parseInt(br.readLine());
    }
    public static int sum(String s, int a, int b) throws Exception{
        int and = ask("and", a, b);
        int or = ask("or", a, b);
        int xor = ~and & or;
        int sum = 2 * and & xor;
        return sum;
    }
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
    }
}
