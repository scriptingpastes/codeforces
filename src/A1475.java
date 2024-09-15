import java.util.*;
public class A1475 {
    public static void solve(long numb){
        if ((numb & numb-1) == 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numb; ++i){
            long numbs = Long.parseLong(sc.nextLine());
            solve(numbs);
        }
    }
}
