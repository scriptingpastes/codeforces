import java.util.*;
import static java.lang.Integer.sum;

public class A69 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        int x = 0; int y = 0; int z = 0;
        for (int j = 0; j < i; j++){
            String k = sc.nextLine();
            String[] a = k.split(" ");
            x+=Integer.parseInt(a[0]);
            y+=Integer.parseInt(a[1]);
            z+=Integer.parseInt(a[2]);
        }
        if (x == 0 && y == 0 && z == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
