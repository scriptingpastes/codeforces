import java.util.*;
public class A451 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] a = x.split(" ");
        int b = Integer.parseInt(a[0]);
        int c = Integer.parseInt(a[1]);
        int res = Math.min(b,c)-1;
        if (res % 2 == 0){
            System.out.println("Akshat");
        }
        else{
            System.out.println("Malvika");
        }
    }
}
