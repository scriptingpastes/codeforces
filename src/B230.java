import java.util.*;
public class B230 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String x = sc.nextLine();
        String[] a = x.split(" ");
        long[] b = Arrays.stream(a)
                    .mapToLong((n) -> Long.parseLong(n))
                    .toArray();
        long[] c = new long[1000001];
        c[1] = 1;
        for (long i = 2; i <= 1000; i++){
           for (long j = i*2; j <= 1000000; j+=i){
               c[(int) j] = 1;
           }
        }
        for (int k = 0; k < b.length; k++){
            long square = (long)Math.sqrt(b[k]);
            if (square*square == b[k] && c[(int)square]!=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
