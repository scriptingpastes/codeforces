import java.util.*;
public class A758 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int res = 0;
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(n->Integer.parseInt(n)).sorted().toArray();
        for (int i = 0; i < arr.length; ++i){
            res += arr[arr.length-1] - arr[i];
        }
        System.out.println(res);
    }
}
