import java.util.*;
public class A1692 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < y; i++) {
            String x = sc.nextLine();
            String[] a = x.split(" ");
            int filters = Integer.parseInt(a[0]);
            long count = Arrays.stream(a).mapToInt(n -> Integer.parseInt(n)).filter((m) -> m > filters).count();
            System.out.println(count);
        }
    }
}
