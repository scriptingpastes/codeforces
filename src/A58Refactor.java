import java.util.*;
public class A58Refactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String target = "hello";
        int counter = 0;
        try {
            for (int i = 0; i < input.length(); i++) {
                if (Character.valueOf(input.charAt(i)).equals(target.charAt(counter))) {
                    counter++;
                }
                if (counter == 5) {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
            System.out.println("NO");
        }
        catch(Exception e){}
    }
}
