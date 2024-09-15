import java.util.*;
public class MaximumMultipleSum {
    public static int maxSum(int target, int numb, HashMap map){
        if (numb > target){
            return 0;
        }
        int sum = 0;
        int count = 0;
        while (count <= target){
            count+= numb;
            sum += count;
        }
        map.put(numb, sum - count);
        return maxSum(target, numb+1, map);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap();
        for (int j = 0; j < i; j++) {
            int k = sc.nextInt();
            maxSum(k, 2, map);
            int max = 0;
            int maxKey = 0;
            for (int c = 2; c < map.size()+2; c++) {
                if (map.get(c) >= max){
                        max = map.get(c);
                        maxKey = c;
                }
            }
            System.out.println(maxKey);
        }
    }
}
