import java.util.*;
public class A479 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        a.add(sc.nextInt());
        int one = a.get(0) + a.get(1) + a.get(2);
        int two = a.get(0) * a.get(1) * a.get(2);
        int three = (a.get(0) + a.get(1)) * a.get(2);
        int four = a.get(0) * (a.get(1) + a.get(2));
        System.out.print(Math.max(Math.max(one, two), Math.max(three, four)));
    }
}
