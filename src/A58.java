import java.util.*;
public class A58 {
    public static int findIndex(String[] arr, String target){
        return Arrays.asList(arr).indexOf(target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] a = x.split("");
//        char [] needle = new char[4];
//        needle[0] = 'h';
        int word_count = 0;
        try {
            while (true) {
                if (word_count == 0) {
                    int idx = findIndex(a, "h");
                    if (idx != -1) {
                        a = Arrays.copyOfRange(a, idx + 1, a.length);
                        word_count++;
                        continue;
                    }
                    else{
                        break;
                    }
                }
                if (word_count == 1){
                    int idx = findIndex(a, "e");
                    if (idx != -1) {
                        a = Arrays.copyOfRange(a, idx + 1, a.length);
                        word_count++;
                        continue;
                    }
                    else{
                        break;
                    }
                }
                if (word_count == 2 || word_count == 3){
                    int idx = findIndex(a, "l");
                    if (idx != -1) {
                        a = Arrays.copyOfRange(a, idx + 1, a.length);
                        word_count++;
                        continue;
                    }
                    else{
                        break;
                    }
                }
                if (word_count == 4){
                    int idx = findIndex(a, "o");
                    if (idx != -1){
                        System.out.println("YES");
                        System.exit(0);
                    }
                }
            }
            System.out.println("NO");
        }
        catch(Exception e){
            System.out.print(e);
            }
        }
    }
