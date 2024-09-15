import java.util.*;
public class GoodPrefixesC {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int i = Integer.parseInt(sc.nextLine());
     for (int j = 0; j < i; j++){
         sc.nextLine();
         String w = sc.nextLine();
         try {
             String[] l = w.split(" ");
             int[] arr = Arrays.stream(l)
                     .mapToInt(n -> Integer.parseInt(n))
                     .toArray();
             long max = 0; long sum = 0; int n = 0;
             for (int x = 0; x < arr.length; x++){
                 max = Math.max(arr[x], max);
                 sum += arr[x];
                 if (max*2 == sum){
                     n++;
                 }
             }
             System.out.println(n);
         }
         catch(Exception e){}
     }
    }
}
