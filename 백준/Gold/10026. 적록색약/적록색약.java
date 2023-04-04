import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] graph1;
    static char[][] graph2;
    static boolean[][] visited;
    static int count;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        graph1 = new char[n+2][n+2];
        graph2 = new char[n+2][n+2];
        visited = new boolean[n+2][n+2];
        String s;
        for (int i = 1; i <= n; i++) {
            s = br.readLine();
            for (int j = 1; j <= n; j++) {
                graph1[i][j] = s.charAt(j-1);
                if (graph1[i][j] == 'G') {
                    graph2[i][j] = 'R';
                } else {
                    graph2[i][j] = graph1[i][j];
                }

            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    count++;
                    dfs1(i,j);
                }
            }
        }
        sb.append(count + " ");
        count = 0;
        visited = new boolean[n+2][n+2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    count++;
                    dfs2(i,j);
                }
            }
        }
        sb.append(count);
        System.out.print(sb);
    }

    static void dfs1(int x, int y) {
        visited[x][y] = true;
        if (!visited[x-1][y] && graph1[x-1][y] == graph1[x][y]) dfs1(x-1,y);
        if (!visited[x+1][y] && graph1[x+1][y] == graph1[x][y]) dfs1(x+1,y);
        if (!visited[x][y-1] && graph1[x][y-1] == graph1[x][y]) dfs1(x,y-1);
        if (!visited[x][y+1] && graph1[x][y+1] == graph1[x][y]) dfs1(x,y+1);
    }

    static void dfs2(int x, int y) {
        visited[x][y] = true;
        if (!visited[x-1][y] && graph2[x-1][y] == graph2[x][y]) dfs2(x-1,y);
        if (!visited[x+1][y] && graph2[x+1][y] == graph2[x][y]) dfs2(x+1,y);
        if (!visited[x][y-1] && graph2[x][y-1] == graph2[x][y]) dfs2(x,y-1);
        if (!visited[x][y+1] && graph2[x][y+1] == graph2[x][y]) dfs2(x,y+1);
    }
}