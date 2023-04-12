import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] list;
    static int n;
    static int m;
    static int r;
    static long[] v;
    static long[] arr;
    static long num=1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        n =Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        list = new ArrayList[n+1];
        v = new long[n+1];
        arr = new long[n+1];
        for(int i=0; i<n+1;i++) {
            list[i] = new ArrayList<>();
            v[i] = -1;
        }
        for(int i=0; i<m;i++) {
            str = br.readLine();
            st = new StringTokenizer(str," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list[x].add(y);
            list[y].add(x);
        }
        for(int i=1; i<=n;i++) {
            Collections.sort(list[i]);
        }
        dfs(r,0);
        long sum = 0;
        for(int i=1; i<=n;i++) {
            sum += v[i] * arr[i];
        }
        sb.append(sum);

        System.out.println(sum);
    }

    static void dfs(int r, int d) {
        v[r] = d;
        arr[r] = num++;
        int length = list[r].size();
        for(int i=length-1; i>=0; i--) {
            if(v[list[r].get(i)] == -1) {
                dfs(list[r].get(i), d+1);
            }
        }
    }
}