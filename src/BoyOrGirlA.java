import java.util.*;
public class BoyOrGirlA {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String j = i.nextLine();
        String[] k = j.split("");
        long l = Arrays.asList(k).stream().distinct().count();
        switch((int)l%2){
            case 0 -> System.out.print("CHAT WITH HER!");
            case 1 -> System.out.print("IGNORE HIM!");
        }
    }
}
