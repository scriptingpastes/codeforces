import java.util.*;
public class WordCapitalizationA {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        String j = i.nextLine();
        StringBuilder k = new StringBuilder();
        k.append(j.substring(0,1).toUpperCase()); k.append(j.substring(1));
        System.out.println(k);
    }
}
