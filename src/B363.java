import java.lang.reflect.Array;
import java.util.*;
public class B363 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int numb = Integer.parseInt(a[1]);
        int[] b = Arrays.stream(sc.nextLine().split(" ")).mapToInt(n->Integer.parseInt(n)).toArray();
        int min_idx = 0;
        int running_sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; ++i){
            running_sum+=b[i];
            if (i >= numb-1){
                min = Math.min(min, running_sum);
                if (min == running_sum) {
                    min_idx = i;
                }
                running_sum -= b[i - (numb-1)];
            }
        }
        System.out.println(min_idx - numb+2);
    }
}
