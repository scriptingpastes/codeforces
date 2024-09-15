import java.util.*;
public class A546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();
        String[] i = o.split(" ");
        int j = Integer.parseInt(i[2]);
        int counter = 1;
        int sum = 0;
        while (counter <= j){
            sum += (Integer.parseInt(i[0]) * counter);
            counter++;
        }
        int res = Integer.parseInt(i[1])-sum < 0 ? Math.abs((Integer.parseInt(i[1])-sum)) : 0;
        System.out.print(res);
    }
}
