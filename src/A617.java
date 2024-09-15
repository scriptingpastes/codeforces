import java.util.*;
public class A617 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        if (numb > 5 && numb % 5 != 0) {
            System.out.println(numb/5+1);
        }
        else if (numb > 5 && numb % 5 == 0){
            System.out.println(numb/5);
        }
        else{
            System.out.println(1);
        }
    }
}
