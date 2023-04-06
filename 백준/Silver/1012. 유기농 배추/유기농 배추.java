import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int M,N;
    static int[][] arr;
    static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[M][N];
            check = new boolean[M][N];
            int count = 0;

            for (int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
            }

            for (int y=0; y<N; y++) {
                for (int x=0; x<M; x++) {
                    if (arr[x][y] == 1 && !check[x][y]){
                        count++;
                        DFS(x, y);
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }

    public static void DFS(int x, int y) {
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        check[x][y] = true;
        for (int i=0; i<4; i++) {
            int xn = x + dx[i];
            int yn = y + dy[i];

            if (xn < M && xn > -1 && yn < N && yn > -1 && arr[xn][yn] == 1 && !check[xn][yn])
                DFS(xn, yn);
        }
    }
}