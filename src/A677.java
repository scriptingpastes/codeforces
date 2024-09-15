import java.util.*;
public class A677 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] a = i.split(" ");
        String j = sc.nextLine();
        String[] b = j.split(" ");
        int count = 0;
        for (int k = 0; k < b.length; k++){
            if (Integer.parseInt(b[k]) > Integer.parseInt(a[1])){
                count+=2;
            }
            else{
                count++;
            }
        }
        System.out.print(count);
    }
}
