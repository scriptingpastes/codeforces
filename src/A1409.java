import java.util.*;
public class A1409 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < iter; i++){
            String x = sc.nextLine().trim();
            String[] a = x.split(" ");
            int[] b = Arrays.stream(a).mapToInt(n-> Integer.parseInt(n)).sorted().toArray();
            System.out.println((int)Math.ceil((Math.abs(b[1]-b[0])) / 10.0));
        }
    }
}
