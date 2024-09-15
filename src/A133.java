import java.util.*;
public class A133 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] a = x.split("");
        long count = Arrays.stream(a).filter(n -> n.equals("H") || n.equals("Q") || n.equals("9")).count();
        if (count > 0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}
