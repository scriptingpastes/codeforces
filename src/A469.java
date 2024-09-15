import java.util.*;
public class A469 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int level = sc.nextInt();
        int iter = sc.nextInt();
        for (int i = 0; i < iter; ++i){
            builder.append(sc.nextInt() + " ");
        }
        int more_iter = sc.nextInt();
        for (int i = 0; i < more_iter; ++i){
            builder.append(sc.nextInt() + " ");
        }
        String ar = builder.toString().trim();
        if (ar.equals("")){
            System.out.println("Oh, my keyboard!");
            System.exit(0);
        }
        int[] arr = Arrays.stream(ar.split(" ")).mapToInt(n->Integer.parseInt(n)).distinct().sorted().toArray();
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; ++i){
            if (arr[i] != i+1 || arr.length < level){
                System.out.println("Oh, my keyboard!");
                System.exit(0);
            }
        }
        System.out.println("I become the guy.");
    }
}
