import java.util.*;
public class A734 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String i = sc.nextLine();
        String[] a = i.split("");
        long x = Arrays.stream(a)
                .filter(m -> m.equals("A"))
                .count();
        long y = Arrays.stream(a)
                .filter(m -> m.equals("D"))
                .count();
        if (x == y){
            System.out.println("Friendship");
        }
        else if (x > y){
            System.out.println("Anton");
        }
        else{
            System.out.println("Danik");
        }
    }
}
