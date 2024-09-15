import java.util.*;
public class A1699 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < iter; i++){
            int numb = Integer.parseInt(sc.nextLine());
            if (numb >= 1900){
                System.out.println("Division 1");
            }
            else if (numb >= 1600){
                System.out.println("Division 2");
            }
            else if (numb >= 1400){
                System.out.println("Division 3");
            }
            else{
                System.out.println("Division 4");
            }
        }
    }
}
