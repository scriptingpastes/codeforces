import java.util.*;
import java.io.*;
public class A514 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        String n = st.nextToken();
        char[] digits = n.toCharArray();
        for (int i = 0; i < digits.length; ++i) {
            if (9 - Integer.parseInt(Character.toString(digits[i])) < Integer.parseInt(Character.toString(digits[i])) && !(digits.length == 1  || i == 0 && 9 - Integer.parseInt(Character.toString(digits[i])) == 0)){
                digits[i] = (char) (9 - Integer.parseInt(Character.toString(digits[i])) + '0');
            }
        }
        Arrays.asList(digits).forEach(System.out::print);
        pw.close();
    }
}
