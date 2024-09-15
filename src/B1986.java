import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class B1986 {
    public static boolean in(int x, int y, int n, int m){{
        return (x >= 0 && y >= 0 && x < n && y < m);
    }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; ++i) {
            int[] a = Arrays.stream(reader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int n = a[0];
            int m  = a[1];
            int[][] matrix = new int[n][m];
            for (int j = 0; j < n; ++j) {
                matrix[j] = Arrays.stream(reader.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};
            for (int k = 0; k < n; ++k) {
                for (int l = 0; l < m; ++l) {
                    int max = 0;
                    for (int o = 0; o < 4; ++o){
                        int nk = k + dx[o];
                        int nl = l + dy[o];
                            if (in(nk, nl, n, m)) {
                                max = Math.max(max, matrix[nk][nl]);
                            }
                    }
                    matrix[k][l] = Math.min(matrix[k][l], max);
                }
            }
            for (int[] rows : matrix){
                for (int num : rows){
                    writer.print(num + " ");
                }
                writer.println();
            }
        }
        writer.flush();
    }
}