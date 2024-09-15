import java.util.*;
public class A41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String j = sc.nextLine();
        StringBuilder x = new StringBuilder();
        char[] k = i.toCharArray();
        for (int y = k.length-1; y > -1; y--){
            x.append(k[y]);
        }
        if (String.valueOf(x).equals(j)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
