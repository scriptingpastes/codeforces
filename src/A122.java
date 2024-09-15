import java.util.*;
public class A122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int[] multiples = {4,7,47,74,477,447,444,777,747,774};
        for (int i = 0; i < multiples.length; i++){
            if (input % multiples[i] == 0){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
