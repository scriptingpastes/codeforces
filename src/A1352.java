import java.util.*;
public class A1352 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; ++i){
            System.out.println();
            String nums = sc.nextLine();
            String[] arr = nums.split("");
            int counter = 1;
            System.out.println(Arrays.stream(arr).mapToInt(n->Integer.parseInt(n)).filter(m -> m != 0).count());
            for (int j = arr.length-1; j > -1; --j){
                int numd = Integer.parseInt(arr[j]);
                if (numd != 0){
                    System.out.print(numd * counter + " ");
                }
                counter*=10;
            }
        }
    }
}
