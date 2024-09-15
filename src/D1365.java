import java.util.*;
import java.io.*;
public class D1365 {
    public static boolean bounds(List<Integer> lst, int n, int m){
        return (lst.get(0) >= 0 && lst.get(0) < n && lst.get(1) >= 0 && lst.get(1) < m);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; ++i){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            String[][] matrix = new String[n][m];
            for (int j = 0; j < n; ++j){
                st = new StringTokenizer(br.readLine());
                String[] arr = st.nextToken().split("");
                for (int l = 0; l < arr.length; ++l){
                    matrix[j][l] = arr[l];
                }
            }
            int moves = 0;
            for (int j = 0; j < matrix.length; ++j){
                for (int l = 0; l < matrix[j].length; ++l){
                    if (matrix[j][l].equals("B")){
                        Stack<List> s = new Stack();
                        Set<List> seen = new HashSet();
                        s.push(List.of(j, l));
                        while (!s.isEmpty()){
                            List<Integer> cur = s.pop();
                            if (!seen.contains(cur) && bounds(cur, n, m)){
                                seen.add(cur);
                                if (!cur.equals(List.of(j, l)) && (!cur.equals(List.of(n-1, m-1)) || (Math.abs(j - (n-1)) + Math.abs(l - (m-1)) == 1))){
                                    matrix[cur.get(0)][cur.get(1)] = "#";
                                }
                            }
                            if (seen.contains(List.of(n-1, m-1))){
                                break;
                            }
                            ArrayList<List<Integer>> pos = new ArrayList();
                            pos.add(List.of(cur.get(0)+1, cur.get(1)));
                            pos.add(List.of(cur.get(0)-1, cur.get(1)));
                            pos.add(List.of(cur.get(0), cur.get(1)+1));
                            pos.add(List.of(cur.get(0), cur.get(1)-1));
                            for (List<Integer> neighbors : pos){
                                if (!seen.contains(neighbors) && bounds(neighbors, n, m) && matrix[neighbors.get(0)][neighbors.get(1)].equals(".")){
                                    s.push(neighbors);
                                    moves++;
                                }
                            }
                        }
                        /*
                        if (seen.contains(List.of(n-1, m-1))){
                            pw.println("B found exit, " + "Testcase : " + (i+1));
                        }
                        for (int iter = 0; iter < matrix.length; iter++){
                            for (int iters = 0; iters < matrix[iter].length; iters++){
                                pw.print(matrix[iter][iters]);
                            }
                            pw.println();
                        }

                         */
                    }
                }
            }
            boolean flag = false;
            for (int j = 0; j < matrix.length; j++){
                for (int l = 0; l < matrix[j].length; l++){
                    if (matrix[j][l].equals("G")) {
                        flag = true;
                        Stack<List> stk = new Stack();
                        Set<List> seen = new HashSet();
                        stk.push(List.of(j, l));
                        while (!stk.isEmpty()) {
                            List<Integer> cur = stk.pop();
                            if (!seen.contains(cur) && bounds(cur, n, m)) {
                                seen.add(cur);
                            }
                            ArrayList<List<Integer>> see = new ArrayList();
                            see.add(List.of(cur.get(0) + 1, cur.get(1)));
                            see.add(List.of(cur.get(0) - 1, cur.get(1)));
                            see.add(List.of(cur.get(0), cur.get(1) + 1));
                            see.add(List.of(cur.get(0), cur.get(1) - 1));
                            for (List<Integer> neighbors : see) {
                                if (!seen.contains(neighbors) && bounds(neighbors, n, m) && !matrix[neighbors.get(0)][neighbors.get(1)].equals("#")) {
                                    stk.push(neighbors);
                                }
                            }
                        }
                        if (seen.contains(List.of(n-1, m-1))){
                            pw.println("YES");
                        }
                        else{
                            pw.println("NO");
                        }
                    }
                }
                if(flag){
                    break;
                }
            }
        }
        pw.close();
    }
}
