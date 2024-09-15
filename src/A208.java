import java.util.*;
public class A208 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder res = new StringBuilder(word.replaceAll("WUB", " ").trim());
        for (int i = 0; i < res.length(); i++){
            if (res.charAt(i) == ' ' && res.charAt(i+1) == ' '){
                res.deleteCharAt(i);
                i--;
            }
        }
        System.out.print(res);
    }
}
