import java.util.*;
public class A1399 {
    public static void solve(int[] nums){
        for (int j = 0; j < nums.length-1; j++){
            if ((nums[j+1] - nums[j]) > 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iter; i++){
            int length = Integer.parseInt(sc.nextLine());
            String[] strs = sc.nextLine().split(" ");
            int[] nums = Arrays.stream(strs).mapToInt(n-> Integer.parseInt(n)).sorted().toArray();
            solve(nums);
        }
    }
}
