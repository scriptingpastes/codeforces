import java.util.*;
public class C1398 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tests; i++){
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split("")).mapToInt(n->Integer.parseInt(n)).toArray();
            int res = 0;
            for (int length = 1; length <= arr.length; length++){
                int running_sum = 0;
                for (int j = 0; j < arr.length; j++){
                    running_sum += arr[j];
                    //System.out.println(running_sum);
                    if (j >= length-1){
                        if (running_sum == length){
                            res++;
                        }
                        running_sum -= arr[j+1-length];
                    }
                }
            }
            System.out.println(res);
        }
    }
}
