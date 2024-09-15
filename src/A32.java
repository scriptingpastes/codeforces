import java.util.*;
public class A32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        String[] b = y.split(" ");
        int max_diff = Integer.parseInt(b[1]);
        String x = sc.nextLine();
        int[] a = Arrays.stream(x.split(" ")).mapToInt(n-> Integer.parseInt(n)).toArray();
        int res = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if ((Math.abs(a[i] - a[j])) <= max_diff && i != j){
                    res++;
                }
            }
        }
        System.out.print(res);
    }
}
