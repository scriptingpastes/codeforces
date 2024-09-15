import java.util.*;
public class A1676 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iter; i++){
            String x = sc.nextLine();
            int[] arr = Arrays.stream(x.split("")).mapToInt(n->Integer.parseInt(n)).toArray();
            int sum = 0;
            int sum1 = 0;
            for (int j = 0; j < arr.length; j++){
                if (j <= 2){
                    sum+=arr[j];
                }
                else{
                    sum1+=arr[j];
                }
            }
            if (sum == sum1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
