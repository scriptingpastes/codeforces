import java.util.*;
public class A579 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = Integer.parseInt(sc.nextLine());
        int res = 0;
        while (numb != 0){
            res += numb % 2;
            numb = numb >> 1;
        }
        System.out.println(res);
    }
}
