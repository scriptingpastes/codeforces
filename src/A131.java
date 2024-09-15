import java.util.*;

import static java.lang.Character.isUpperCase;

public class A131 {
    public static boolean isCapsLock(String input){
        char[] arr = input.toCharArray(); int counter = 0;
        for (int i = 1; i < arr.length; i++){
            if (isUpperCase((arr[i]))){
                counter++;
            }
            if (counter == arr.length-1){
                return true;
            }
        }
        return false;
    }
    public static String convertStr(String input){
        char[] arr = input.toCharArray();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
            else{
                arr[i] = Character.toUpperCase(arr[i]);
            }
            res.append(arr[i]);
        }
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(); //input
        if (x.length() == 1){
            String n = isUpperCase(x.charAt(0)) ? x.toLowerCase() : x.toUpperCase();
            System.out.print(n);
            System.exit(0);
        }
        boolean result = isCapsLock(x);
        if (result){
            String res = convertStr(x);
            System.out.print(res);
        }
        else{
            System.out.print(x);
        }
    }
}
