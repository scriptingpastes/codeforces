import java.util.*;
public class C1398_WithDP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < tests; i++){
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split("")).mapToInt(n->Integer.parseInt(n)).toArray();
            int[] prefixSums = new int[arr.length+1];
            int res = 0;
            prefixSums[0] = 0;
            for (int j = 1; j <= arr.length; ++j){
                prefixSums[j] = prefixSums[j-1] + arr[j-1];
            }
            //System.out.println(Arrays.toString(prefixSums));
            for (int length = 1; length < arr.length+1; ++length){
                int counter = arr.length;
                while(counter - length > -1) {
                    if (prefixSums[counter] - prefixSums[counter - length] == length) {
                        res++;
                    }
                    counter--;
                }
            }
            System.out.println(res);
            }
        }
    }