import java.util.*;
import java.io.*;
public class C755 {
    static boolean[] visited;
    static ArrayList<Integer>[] adjList;
    static int count;
    public static void dfs(int root){
        if (visited[root]){
            return;
        }
        visited[root] = true;
        for (int children : adjList[root]){
            dfs(children);
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        adjList = new ArrayList[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i){
            adjList[i] = new ArrayList();
        }
        for (int i = 0; i < n; ++i){
            int other = Integer.parseInt(st.nextToken())-1;
            adjList[i].add(other);
            adjList[other].add(i);
        }
        for (int i = 0; i < adjList.length; ++i){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        pw.println(count);
        pw.close();
    }
}
