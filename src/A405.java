import java.util.*;
import java.util.stream.Collectors;

public class A405 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        String[] a = s.split(" ");
        ArrayList<Integer> arr = new ArrayList((Arrays.stream(a).mapToInt(n -> Integer.parseInt(n)).sorted().boxed().collect(Collectors.toList())));
        arr.forEach(n -> System.out.print(n+" "));
    }
}
