import java.util.*;
public class A318 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        String[] a = q.split(" ");
        double n = Double.parseDouble(a[0]);
        long k = Long.parseLong(a[1]);
        long res = 0;
        if (k <= Math.ceil(n/2)){
                res = (k * 2) - 1;
        }
        else{
                k -= n / 2;
                res = k * 2;
        }
        System.out.println(res);
    }
}
