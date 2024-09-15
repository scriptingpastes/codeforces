import java.util.*;
public class B492 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] a = x.split(" ");
        int numb = Integer.parseInt(a[0]);
        int length = Integer.parseInt(a[1]);
        String y = sc.nextLine();
        String[] b = y.split(" ");
        long[] c = Arrays.stream(b).mapToLong(n->Long.parseLong(n)).sorted().toArray();
        double max_diff = 0;
        max_diff = (Math.max(c[0], length - c[numb-1])) * 2;
        for (int i = 1; i < c.length; i++){
                max_diff = Math.max(max_diff, (double)(c[i] - c[i-1]));
        }
        System.out.print(max_diff / 2);
    }
}
