import java.util.*;
public class OneOneTwoA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d = sc.nextLine();
        int f = s.compareToIgnoreCase(d);
        int n = f == 0 ? 0 : f / Math.abs(f);
        System.out.print(n);
    }
}
