import java.util.*;
public class B158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        String a = sc.nextLine();
        String[] b = a.split(" ");
        HashMap<Integer, Integer> map = new HashMap();
        int[] c = Arrays.stream(b).mapToInt(n -> Integer.parseInt(n)).sorted().toArray();
        int sum = 0;
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        map.put(4, 0);
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i])) {
                map.replace(c[i], (map.get(c[i]) + 1));
            } else {
                map.replace(c[i], 1);
            }
        }
        if (map.get(4) > 0){
            sum+= map.get(4);
            map.replace(4, 0);
        }
        while (map.get(1) > 0 && map.get(3) > 0) {
            sum++;
            map.replace(1, map.get(1) - 1);
            map.replace(3, map.get(3) - 1);
        }
        while (map.get(2) > 1) {
            sum++;
            map.replace(2, map.get(2) - 2);
        }
        while (map.get(2) > 0 && map.get(1) > 1) {
            sum++;
            map.replace(2, map.get(2) - 1);
            map.replace(1, map.get(1) - 2);
        }
        while (map.get(1) > 3) {
            sum++;
            map.replace(1, map.get(1) - 4);
        }
        if (map.get(1) > 0 && map.get(2) > 0) {
            sum++;
            map.replace(1, map.get(1) - 1);
            map.replace(2, map.get(2) - 1);
        }
        if (map.get(1) > 2) {
            sum++;
            map.replace(1, map.get(1) - 3);
        }
        if (map.get(1) > 1) {
            sum++;
            map.replace(1, map.get(1)-2);
        }
        for (int j = 1; j < 5; j++){
            if (map.get(j) == null){
                continue;
            }
            sum+=map.get(j);
        }
        System.out.print(sum);
    }
}
