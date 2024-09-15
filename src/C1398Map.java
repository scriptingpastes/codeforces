import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class C1398Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tests; i++) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split("")).mapToInt(n -> Integer.parseInt(n)).toArray();
            HashMap<Integer, Integer> map = new HashMap();
            map.put(0, 1);
            int x = 0;
            int y = 0;
            int sum = 0;
            for (int j = 0; j < arr.length; ++j) {
                x += arr[j];
                y = x - j - 1;
                if (map.containsKey(y)) {
                    map.replace(y, map.get(y) + 1);
                } else {
                    map.put(y, 1);
                }
                sum = sum + map.get(y) - 1;
            }
            System.out.println(map);
            System.out.println(sum);
        }
    }
}
