import java.util.*;
public class B1699 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iter; i++){
            sc.nextLine();
            String x = sc.nextLine();
            int[] arr = Arrays.stream(x.split(" ")).mapToInt(n->Integer.parseInt(n)).toArray();
            HashMap<Integer, Integer> map = new HashMap();
            for (int j = 0; j < arr.length; j++){
                if (map.containsKey(arr[j])){
                    map.replace(arr[j], map.get(arr[j])+1);
                }
                else{
                    map.put(arr[j], 1);
                }
            }
            int counter = 0;
            for (var entry : map.entrySet()){
                if (entry.getValue() >= 3){
                    System.out.println(entry.getKey());
                    break;
                }
                else if (counter == map.size()-1){
                    System.out.println(-1);
                }
                else{
                    counter++;
                }
            }
        }
    }
}
