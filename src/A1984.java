import java.util.*;
public class A1984 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iter; i++){
            sc.nextLine();
            String x = sc.nextLine();
            String[] a = x.split(" ");
            int[] b = Arrays.stream(a).mapToInt(m->Integer.parseInt(m)).toArray();
            String[] res = new String[b.length];
            if (b[b.length-1] == b[0] && b.length > 1){
                System.out.println("NO");
            }
            else{
                for (int j = 0; j < b.length; j++){
                    if (j == b.length / 2){
                        res[j] = "R";
                    }
                    else{
                        res[j] = "B";
                    }
                }
                System.out.println("YES");
                Arrays.asList(res).forEach(System.out::print);
                System.out.print("\n");
            }
        }
    }
}
