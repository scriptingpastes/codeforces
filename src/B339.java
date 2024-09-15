import java.util.*;
public class B339 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] a = x.split(" ");
        int houses = Integer.parseInt(a[0]);
        long sum = 0;
        String y = sc.nextLine();
        String[] b = y.split(" ");
        int[] c = Arrays.stream(b).mapToInt(n->Integer.parseInt(n)).toArray();
        for (int i = 0; i < c.length; i++){
            System.out.println(sum);
            if (i == 0){
                sum += (c[0]-1);
            }
            else if (c[i] >= c[i-1]){
                sum += c[i]-c[i-1];
            }
            else{
                sum += (c[i] + houses - c[i-1]);
            }
        }
        System.out.print(sum);
    }
}
