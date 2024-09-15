import java.util.*;
public class OneFiveEightA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] j = i.split(" ");
        int x = Integer.parseInt(j[1]);
        String k = sc.nextLine();
        String[] z = k.split(" ");
        int c = Integer.parseInt(z[x-1]);
        long res = Arrays.stream(z)
                        .mapToInt(b -> Integer.parseInt(b))
                        .filter(v -> v >= c && v != 0)
                        .count();
        System.out.print(res);
    }
}
