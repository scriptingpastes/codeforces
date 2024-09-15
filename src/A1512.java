import java.util.*;
public class A1512 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iters = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iters; i++){
            sc.nextLine();
            String x = sc.nextLine();
            String[] a = x.split(" ");
            int[] b = Arrays.stream(a).mapToInt(n-> Integer.parseInt(n)).toArray();
            HashMap<Integer, Integer> map = new HashMap();
            for (int j = 0; j < b.length; j++){
                if (map.containsKey(b[j])){
                    map.replace(b[j], map.get(b[j])+1);
                }
                else{
                    map.put(b[j], 1);
                }
            }
            int dup = 0;
            for (var entry : map.entrySet()){
                if (entry.getValue() == 1){
                    dup = entry.getKey();
                }
            }
            for (int k = 0; k < b.length; k++){
                if (b[k] == dup){
                    System.out.println(k+1);
                }
            }
        }
    }
}
