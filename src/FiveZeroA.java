import java.util.*;
public class FiveZeroA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        try{
            String[] j = i.split(" ");
            int k = Integer.parseInt(j[0]) * Integer.parseInt(j[1]);
            System.out.print(k/2);
        }
        catch(Exception e){}

    }
}
