import java.util.*;
public class recur {
    static int mod = (int)1e9+7;
    public static void main(String[] args){
        long[] fibbonaci_numbers = new long[100];
        // kth fibbonaci number
        fibbonaci_numbers[0] = 0;
        fibbonaci_numbers[1] = 1;
        for (int i = 2; i < fibbonaci_numbers.length; i = i + 1){ // 3.. 4.. 5.. . 99 4 = 3 + 2
            fibbonaci_numbers[i] = fibbonaci_numbers[i-1] + fibbonaci_numbers[i-2] % mod;
        }
        System.out.println(Arrays.toString(fibbonaci_numbers));
    }
}
