import java.util.*;
public class B266 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] a = i.split(" ");
        int secs = Integer.parseInt(a[1]);
        char[] b = sc.nextLine().toCharArray();
        int time = 0; boolean flag = false;
        while (time != secs) {
            for (int k = 0; k < b.length - 1; k++) {
                if (b[k] == 'B' && b[k + 1] == 'G' && !flag) {
                    b[k] = 'G';
                    b[k + 1] = 'B';
                    if (k != b.length-2) {
                        flag = true;
                    }
                }
                else {
                    flag = false;
                }
            }
            time++;
        }
        Arrays.asList(b).stream().forEach(System.out::println);
    }
}
