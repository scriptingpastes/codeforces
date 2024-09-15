import java.util.*;
import java.util.stream.Collectors;

public class ThreeThreeNineA {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] j = i.split("");
        int[] k = Arrays.stream(j)
                    .filter(f -> !f.equals("+"))
                    .mapToInt(l -> Integer.parseInt(l))
                    .sorted()
                    .toArray();
        StringBuilder res = new StringBuilder();
        for (int z = 0; z < k.length; z++){
            res = z == 0 ? res.append((k[z])) : res.append("+"+k[z]);
        }
        System.out.print(res);
    }
}
