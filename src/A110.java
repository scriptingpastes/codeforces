import java.util.*;
public class A110 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] a = i.split("");
        long res = Arrays.stream(a)
                .mapToInt(j -> Integer.parseInt(j))
                .filter((k) -> k == 4 || k == 7)
                .count();
        if (res == 7 || res == 4){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
