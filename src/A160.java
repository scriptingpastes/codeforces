import java.util.*;
public class A160 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String x = sc.nextLine();
        String[] a = x.split(" ");
        int[] b = Arrays.stream(a)
                .mapToInt(n -> Integer.parseInt(n))
                .sorted()
                .toArray();

        int coins = 0; int sum = Arrays.stream(b).reduce(0, (q,w) -> q+w); int count = b.length-1; int zero = 0;
        while (sum - coins >= coins){
            coins += b[count];
            zero++;
            count--;
        }
        System.out.println(zero);
    }
}
