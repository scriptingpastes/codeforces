import java.util.*;
public class A472 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if (number % 2 == 0){
            System.out.println(8 + " " + (number - 8));
        }
        else{
            System.out.println(9 + " " + (number - 9));
        }
    }
}
