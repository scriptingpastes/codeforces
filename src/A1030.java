import java.util.*;
public class A1030 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String x = sc.nextLine();
        String[] arr = x.split(" ");
        long count = Arrays.stream(arr)
                          .mapToInt(n -> Integer.parseInt(n))
                          .filter(m -> m!=0)
                          .count();
        if (count >= 1){
            System.out.print("HARD");
        }
        else{
            System.out.print("EASY");
        }
    }
}
