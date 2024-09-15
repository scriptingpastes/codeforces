import java.util.*;
public class B706 {
    public static int upperBound(int[] arr, int target){
        int low = 0; int hi = arr.length;
        while (low < hi){
            int mid = (low+hi) / 2;
            if (arr[mid] <= target){
                low = mid+1;
            }
            else{
                hi = mid;
            }
        }
        return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(n->Integer.parseInt(n)).sorted().toArray();
        int iter = Integer.parseInt(sc.nextLine());
        /*
        long[] dp = new long[100000000];
        dp[0] = 0;
        for (int i = 1; i < 1000000; i++){
            dp[i] = dp[i-1];
            for (int j = 0; j < arr.length; j++){
                if (i == arr[j]){
                    ++dp[i];
                }
                if (j > arr[j]){
                    break;
                }
            }
        }
         */
        for (int i = 0; i < iter; i++){
            int coins = Integer.parseInt(sc.nextLine());
            System.out.println(upperBound(arr, coins));
        }
    }
}
