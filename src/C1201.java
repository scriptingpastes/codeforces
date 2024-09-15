import java.util.*;
import java.io.*;
public class C1201 {
    public static long search(long L, long H, int[] arr, int limit){
        long ans = 0;
        while (L <= H){
            long mid = L + (H - L) / 2;
            if (Check(arr, mid, limit)){
                L = mid + 1;
                ans = mid;
            }
            else{
                H = mid - 1;
            }
        }
        return ans;
    }
    public static boolean Check(int[] arr, long checkNumb, int limit) {
        long moves = 0;
        int n = arr.length;
        for (int j = n / 2; j < arr.length; ++j) {
            moves = moves + Math.max(0, checkNumb - arr[j]);
        }
        return moves <= limit;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        pw.println(search(arr[n/2], arr[n/2]+k, arr, k));
        pw.close();
    }
}
