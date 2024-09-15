import java.util.*;
public class CreatingWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 0; j < i+1; j++){
            String k = sc.nextLine();
            try {
                String[] l = k.split(" ");
                String a = l[0].substring(0, 1) + l[1].substring(1);
                String b = l[1].substring(0, 1) + l[0].substring(1);
                System.out.print(b + " ");
                System.out.println(a);
            }
            catch(Exception e){}
        }
    }
}
