import java.util.*;
public class A381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String x = sc.nextLine();
        ArrayList<Integer> arrs = new ArrayList();
        int[] arr = Arrays.stream(x.split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
        int counter = 1; int left = 0; int right = arr.length-1;
        int score = 0;
        int score1 = 0;
        int pointer = arr[left];
        int pointer1 = arr[right];
        try {
            while (left <= right) {
                if (counter % 2 == 1) {
                    if (pointer >= pointer1) {
                        score += pointer;
                        pointer = arr[++left];
                    } else {
                        score += pointer1;
                        pointer1 = arr[--right];
                    }
                } else {
                    if (pointer >= pointer1) {
                        score1 += pointer;
                        pointer = arr[++left];
                    } else {
                        score1 += pointer1;
                        pointer1 = arr[--right];
                    }
                }
                counter++;
            }
        }
        catch(Exception e){}
        System.out.println(score + " " + score1);
    }
}

