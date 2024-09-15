import java.util.*;
public class StonesOnTheTableA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String i = sc.nextLine();
        String[] j = i.split("");
        int count = 0;
        for (int k = 0; k < j.length-1; k++){
            if (j[k].equals(j[k+1])){
                count++;
            }
        }
        System.out.print(count);
    }
}
