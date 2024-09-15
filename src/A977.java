import java.util.*;
public class A977 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] j = i.split(" ");
        int counter = 0; int res = Integer.parseInt(j[0]);
        while (counter != Integer.parseInt(j[1])){
            if (res%10 != 0){
                res-=1;
            }
            else{
                res/=10;
            }
            counter++;
        }
        System.out.print(res);
    }
}
