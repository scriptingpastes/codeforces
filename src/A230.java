import java.util.*;
public class A230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] a = x.split(" ");
        int strength = Integer.parseInt(a[0]);
        int lines = Integer.parseInt(a[1]);
        HashMap<Integer, Integer> map = new HashMap();
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < lines; i++) {
            String y = sc.nextLine();
            String[] b = y.split(" ");
            int[] c = Arrays.stream(b).mapToInt(n -> Integer.parseInt(n)).toArray();
            if (map.containsKey(c[0])){
                map.replace(c[0], map.get(c[0])+c[1]);
            }
            else{
                map.put(c[0], c[1]);
            }
        }
        for (var entry : map.entrySet()){
            arr.add(entry.getKey());
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++){
            if (strength > arr.get(i)){
                strength += map.get(arr.get(i));
            }
            else if (strength == arr.indexOf(i)){
                continue;
            }
            else{
                System.out.print("NO");
                System.exit(0);
            }
        }
        System.out.print("YES");
    }
}
