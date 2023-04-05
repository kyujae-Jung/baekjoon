import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] check;
    static int count = 0;

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        DFS(1);

        System.out.println(count-1);
    }

    public static void DFS(int start) {
        check[start] = true;
        count++;

        for (int i=0; i<=N; i++) {
            if (arr[start][i] == 1 && !check[i])
                DFS(i);
        }
    }
}