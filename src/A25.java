import java.util.*;
public class A25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String x = sc.nextLine();
        int[] a = Arrays.stream(x.split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        int evens = 0; int odds = 0; int even_idx = 0; int odd_idx = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                evens++;
                even_idx = i;
            }
            else{
                odds++;
                odd_idx = i;
            }
        }
        int res = odds == 1 ? odd_idx : even_idx;
        System.out.print(res+1);
    }
}
