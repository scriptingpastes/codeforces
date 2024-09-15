import java.util.*;
public class A271 {
    public static boolean isDistinct(int number) {
        String a = String.valueOf(number);
        String[] b = a.split("");
        long c = Arrays.stream(b).distinct().count();
        return c == a.length();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (!isDistinct(i+1)){
            i++;
        }
        System.out.println(i+1);
    }
}
