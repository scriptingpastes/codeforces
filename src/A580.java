import java.util.*;
public class A580 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String x = sc.nextLine();
        String[] a = x.split(" ");
        int length = 1; int max = 1;
        for (int i = 0; i < a.length-1; i++){
            if (Integer.parseInt(a[i]) <= Integer.parseInt(a[i+1])){
                length++;
                max = Math.max(length, max);
            }
            else{
                length=1;
            }
        }
        System.out.print(max);
    }
}
