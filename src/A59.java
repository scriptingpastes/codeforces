import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Character.isUpperCase;

public class A59 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        char[] j = i.toCharArray();
        int upper = 0; int lower = 0;
        for ( char x : j){
            if (isUpperCase(Character.valueOf(x))){
                upper++;
            }
            else{
                lower++;
            }
        }
        if (upper > lower){
            System.out.println(i.toUpperCase());
        }
        else{
            System.out.println(i.toLowerCase());
        }
    }
}
