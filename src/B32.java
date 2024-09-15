import java.util.*;
public class B32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        for (int i = 0; i < x.length(); i++){
            try {
                if (x.charAt(i) == '.') {
                    System.out.print(0);
                } else if (x.charAt(i) == '-' && x.charAt(i + 1) == '.') {
                    System.out.print(1);
                    ++i;
                } else {
                    System.out.print(2);
                    ++i;
                }
            }
            catch(Exception e){}
        }
    }
}
