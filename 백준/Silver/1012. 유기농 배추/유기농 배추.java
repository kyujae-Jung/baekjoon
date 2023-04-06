import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int M;

    private static int N;

    private static int[][] arr;

    private static boolean[][] check;


    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++)
        {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[M][N];
            check = new boolean[M][N];
            int bugs = 0;

            for (int j = 0; j < K; j++)
            {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[x][y] = 1;
            }

            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (arr[x][y] == 1 && !check[x][y]){
                        bugs++;
                        dfs(x, y);
                    }
                }
            }
            System.out.println(bugs);
        }
        br.close();
    }

    private static void dfs(int row, int col){
    int[] dx = { 0, 0, -1, 1 };
    int[] dy = { -1, 1, 0, 0 };
    check[row][col] = true;
    for (int i = 0; i < 4; i++){
        int xn = row + dx[i];
        int yn = col + dy[i];

        if ((xn > -1 && xn < M) && (yn > -1 && yn < N) && arr[xn][yn] == 1 && !check[xn][yn]) {
            dfs(xn, yn);
        }
    }
    }
}