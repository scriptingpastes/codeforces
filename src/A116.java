import java.util.*;
public class A116 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        int passengers = 0; int max = 0;
        for (int j = 0; j < i; j++){
            String k = sc.nextLine();
            String[] arr = k.split(" ");
            passengers+=Integer.parseInt(arr[1]);
            passengers-=Integer.parseInt(arr[0]);
            max = Math.max(passengers, max);
        }
        System.out.print(max);
    }
}
