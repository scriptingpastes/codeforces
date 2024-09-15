import java.util.*;
public class A723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int[] arr = Arrays.stream(x.split(" ")).mapToInt(n -> Integer.parseInt(n)).sorted().toArray();
        int distance = arr[2] - arr[1] + Math.abs(arr[0] - arr[1]);
        System.out.print(distance);
    }
}