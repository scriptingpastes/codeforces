import java.util.*;
public class StringTaskA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] j = i.split("");
        StringBuilder s = new StringBuilder();
          Arrays.stream(j)
                  .map((k) -> k.toLowerCase())
                .filter((n) -> !(n.equals("a") || n.equals("o") || n.equals("y") || n.equals("e") || n.equals("i") || n.equals("u")))
                .map((z) -> "."+z)
                .forEach((c) -> s.append(c));
        System.out.println(s);
    }
}
