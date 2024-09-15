import java.util.*;
import java.io.*;
public class B1020 {
    static int[] adjList;
    static int[] ans;
    static boolean in_cycle = false;
    static PrintWriter pw = new PrintWriter(System.out);
    public static void dfs(int node){
        if (ans[node] != -2){
            if (ans[node] == -1){
                in_cycle = true;
                ans[node] = node;
                return;
            }
        }
        ans[node] = -1;
        dfs(adjList[node]);
        if (ans[node] != -1){
            in_cycle = false;
        }
        else{
            ans[node] = in_cycle ? node : ans[adjList[node]];
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        adjList = new int[n];
        ans = new int[n];
        Arrays.fill(ans, -2);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i){
            adjList[i] = (Integer.parseInt(st.nextToken())-1);
        }
        for (int i = 0; i < n; ++i){
            dfs(i);
        }
        pw.println(Arrays.toString(ans));
        pw.close();
    }
}
