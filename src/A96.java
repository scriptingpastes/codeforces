import java.util.*;
public class A96 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] j = i.split("");
        int x = 0; int y = 0;
        for (int k = 0; k < j.length; k++){
            if (Integer.parseInt(j[k]) == 0){
                x++;
                y = 0;
            }
            else{
                y++;
                x = 0;
            }
            if (x == 7 || y == 7){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
