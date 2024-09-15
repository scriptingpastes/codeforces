import java.util.*;
import java.io.*;
public class D1365try {
    public static boolean bound(List<Integer> arr, int n, int m) {
        return (arr.get(0) >= 0 && arr.get(0) < n && arr.get(1) >= 0 && arr.get(1) < m);
    }
    public static String solve(String[][] matrix){
        for (int i = 0; i < matrix.length; ++i){
            for (int j = 0; j < matrix[i].length; ++j){
                if (matrix[i][j].equals("B")){
                    ArrayList<List<Integer>> arrs = new ArrayList();
                    arrs.add(List.of(i, j+1));
                    arrs.add(List.of(i, j-1));
                    arrs.add(List.of(i-1, j));
                    arrs.add(List.of(i+1, j));
                    for (List<Integer> neighbors : arrs){
                        if (bound(neighbors, matrix.length, matrix[0].length) && matrix[neighbors.get(0)][neighbors.get(1)].equals("G")){
                            return "No";
                        }
                        else if (bound(neighbors, matrix.length, matrix[0].length) && !matrix[neighbors.get(0)][neighbors.get(1)].equals("B")){
                            matrix[neighbors.get(0)][neighbors.get(1)] = "#";
                        }
                    }
                }
            }
        }
        boolean flag = false;
        int count = 0;
        int numb = 0;
        for (int i = 0; i < matrix.length; ++i){
            for (int j = 0; j < matrix[i].length; ++j){
                if (matrix[i][j].equals("G")){
                    numb++;
                    flag = true;
                    if (dfs(matrix, List.of(i, j))){
                        count++;
                    }
                }
            }
        }
        if (numb > 0){
            if (numb == count){
                return "Yes";
            }
            else{
                return "No";
            }
        }
        if (!flag){
            return "Yes";
        }
        else{
            return "No";
        }
    }
    public static boolean dfs(String[][] matrix, List<Integer> cur){
        int n = matrix.length;
        int m = matrix[0].length;
        Stack<List<Integer>> s = new Stack();
        Set<List<Integer>> seen = new HashSet();
        s.push(cur);
        while(!s.isEmpty()){
            List<Integer> current = s.pop();
            if (!seen.contains(current) && bound(current, matrix.length, matrix[0].length) && !matrix[current.get(0)][current.get(1)].equals("#")){
                seen.add(current);
            }
            ArrayList<List<Integer>> find_neighbors = new ArrayList();
            find_neighbors.add(List.of(current.get(0)+1, current.get(1)));
            find_neighbors.add(List.of(current.get(0)-1, current.get(1)));
            find_neighbors.add(List.of(current.get(0), current.get(1)+1));
            find_neighbors.add(List.of(current.get(0), current.get(1)-1));
            for (List<Integer> neighbors : find_neighbors){
                if (!seen.contains(neighbors) && bound(neighbors, matrix.length, matrix[0].length) && !matrix[neighbors.get(0)][neighbors.get(1)].equals("#")){
                    s.push(neighbors);
                }
            }
        }
        return seen.contains(List.of(n-1,m-1));
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
            pw.println(solve(matrix));
        }
        pw.close();
    }
}