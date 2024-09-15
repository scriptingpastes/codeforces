import java.util.*;
public class TwoEightTwoA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int running_count = 0;
            for (int i = 0; i < num+1; i++) {
                String in = sc.nextLine();
                try {
                    String strs = in.substring(in.length() - 2, in.length());
                    String str = in.substring(0, 2);
                    if (str.equals("++") || strs.equals("++")) {
                        running_count++;
                    }
                    if (str.equals("--") || strs.equals("--")) {
                        running_count--;
                    }
                }
                catch(Exception e){}
            }
        System.out.println(running_count);
        }
    }
