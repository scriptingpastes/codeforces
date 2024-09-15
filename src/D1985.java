import java.util.*;
public class D1985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < x; i++) {
            String y = sc.nextLine();
            String[] a = y.split(" ");
            int z = Integer.parseInt(a[0]);
            int sumX = 0;
            int sumY = 0;
            int count = 0;
            for (int j = 0; j < z; j++) {
                String c = sc.nextLine();
                String[] b = c.split("");
                for (int k = 0; k < b.length; k++) {
                    if (b[k].equals("#")) {
                        count++;
                        sumX += k;
                        sumY += j;
                    }
                }
            }
            System.out.printf("%d %d\n", (sumY / count) + 1, (sumX / count) + 1);
        }
    }
}
