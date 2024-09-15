import java.util.*;
public class TwoSixThreeA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 6; i++){
            int l = 0;
            String p = sc.nextLine();
            String[] j = p.split(" ");
            for (String k : j){
                l++;
                if (k.equals(String.valueOf(1))){
                    System.out.print(Math.abs((3-l)) + Math.abs((3-i)));
                }
            }
        }
    }
}
