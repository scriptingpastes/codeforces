import java.util.*;
public class B1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iter; i++){
            String x = sc.nextLine();
            int[] arr = Arrays.stream(x.split(" ")).mapToInt(n-> Integer.parseInt(n)).toArray();
            long n = arr[0]; long a = arr[1]; long b = arr[2]; long sum = 0; long iters = 0;
            if (b > a) {
                iters = Math.min(n, b-a+1);
                if (iters % 2 == 0){
                    sum = ((b + b-iters+1) * iters) / 2;
                }
                else{
                    sum = ((b + b-iters+1) * iters) / 2;
                }
                n -= iters;
            }
            System.out.println(sum + (n * a));
        }
    }
}
