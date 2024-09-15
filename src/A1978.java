import java.util.*;
public class A1978 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iter; i++){
            sc.nextLine();
            String x = sc.nextLine();
            int[] arr = Arrays.stream(x.split(" ")).mapToInt(n-> Integer.parseInt(n)).toArray();
            int max = 0;
            for (int j = 0; j < arr.length - 1; j++){
                max = Math.max(arr[j], max);
            }
            int res = max + arr[arr.length-1];
            System.out.println(res);
        }

    }
}
