import java.util.*;

public class OneA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] arrs = n.split(" ");
        long[] arr = Arrays.stream(arrs)
                          .mapToLong(s -> Long.parseLong(s))
                          .toArray();
        long i = arr[1] % arr[2] == 0 ? arr[1] / arr[2] : arr[1] / arr[2] + 1;
        long j = arr[0] % arr[2] == 0 ? arr[0] / arr[2] : arr[0] / arr[2] + 1;
        System.out.print(i*j);
    }
}
