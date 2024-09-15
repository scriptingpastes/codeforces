import java.util.*;
import java.io.*;
public class D1365_sol {
    public static boolean bound(List<Integer> arr, int n, int m){
        return (arr.get(0) >= 0 && arr.get(0) < n && arr.get(1) >= 0 && arr.get(1) < m);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i) {
            boolean flag = false;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String[][] matrix = new String[n][m];
            for (int j = 0; j < n; ++j) {
                st = new StringTokenizer(br.readLine());
                String[] arr = st.nextToken().split("");
                for (int l = 0; l < arr.length; ++l) {
                    matrix[j][l] = arr[l];
                }
            }
            boolean check = false;
            for (int l = 0; l < matrix.length; ++l){
                if(check){
                    break;
                }
                for (int j = 0; j < matrix[l].length; ++j){
                    if(matrix[l][j].equals("B")){
                        ArrayList<List<Integer>> side = new ArrayList();
                        side.add(List.of(l+1, j));
                        side.add(List.of(l-1, j));
                        side.add(List.of(l, j+1));
                        side.add(List.of(l, j-1));
                        for (List<Integer> sides : side){
                            if (bound(sides, n, m)){
                                if (matrix[sides.get(0)][sides.get(1)].equals("G")){
                                    pw.println("No");
                                    check = true;
                                }
                                else{
                                    matrix[sides.get(0)][sides.get(1)] = "#";
                                }
                            }
                        }
                    }
                }
            }
            if(check){
                continue;
            }
            for (int q = 0; q < matrix.length; q++){
                for (int w = 0; w < matrix[q].length; w++){
                    if (matrix[q][w].equals("G")){
                        check = true;
                        Stack<List> s = new Stack();
                        Set<List> seen = new HashSet();
                        s.push(List.of(q, w));
                        while (!s.isEmpty()){
                            List<Integer> cur = s.pop();
                            if (!seen.contains(cur) && bound(cur, n, m)){
                                seen.add(cur);
                            }
                            ArrayList<List<Integer>> nei = new ArrayList();
                            nei.add(List.of(cur.get(0)+1, cur.get(1)));
                            nei.add(List.of(cur.get(0)-1, cur.get(1)));
                            nei.add(List.of(cur.get(0), cur.get(1)+1));
                            nei.add(List.of(cur.get(0), cur.get(1)-1));
                            for (List<Integer> neighbors : nei){
                                if (bound(neighbors, n, m) && !seen.contains(neighbors) && !matrix[neighbors.get(0)][neighbors.get(1)].equals("#")) {
                                    s.push(neighbors);
                                }
                            }
                        }
                        if (seen.contains(List.of(n-1, m-1))){
                            pw.println("Yes");
                        }
                        else{
                            pw.println("No");
                        }
                        break;
                    }
                }
                if(check){
                    break;
                }
            }
            if(!check){
                pw.println("Yes");
            }
        }
        pw.close();
    }
}
