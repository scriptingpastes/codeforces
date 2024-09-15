import java.util.*;
public class C4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iter = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < iter; i++){
            String username = sc.nextLine();
            if (map.containsKey(username)){
                map.replace(username, map.get(username)+1);
                map.put(username + map.get(username), 0);
                System.out.println(username + map.get(username));
            }
            else{
                map.put(username, 0);
                System.out.println("OK");
            }
        }
    }
}
