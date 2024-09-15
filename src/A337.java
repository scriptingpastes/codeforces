import java.util.*;
public class A337 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] a = x.split(" ");
        int n = Integer.parseInt(a[0]);
        String y = sc.nextLine();
        String[] b = y.split(" ");
        int[] c = Arrays.stream(b).mapToInt((q)-> Integer.parseInt(q)).sorted().toArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < c.length - n+1; i++){
            min = Math.min(min, c[i+n-1] - c[i]);
        }
        System.out.print(min);
    }
}
