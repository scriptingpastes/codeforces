import java.util.*;
public class BearAndBigBrotherA {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String j = i.nextLine();
        String[] k = j.split(" ");
        int l = Integer.parseInt(k[0]); int z = Integer.parseInt(k[1]); int count = 0;
        while (l <= z){
            l*=3;
            z*=2;
            count++;
        }
        System.out.print(count);
    }
}
