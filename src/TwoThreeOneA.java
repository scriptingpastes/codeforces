import java.util.*;
public class TwoThreeOneA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        for (int i = 0; i < n+1; i++){
            String s = in.nextLine();
            try{
                String[] arr = s.split(" ");
                long res = Arrays.stream(arr)
                                 .filter(a -> Integer.valueOf(a).equals(1))
                                 .count();
                if (res > 1){
                    result++;
                }
            }
            catch(Exception e){
            }
        }
        System.out.print(result);
    }
}
