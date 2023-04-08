import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i=1; i<N+1; i++) {
            queue.add(i);
        }

        sb.append("<");

        while( queue.size() > 1 ) {
            for(int i=0; i<K-1; i++) {
                int temp = queue.poll();
                queue.add(temp);
            }
            int num = queue.poll();
            sb.append(num).append(", ");

        }

        int num = queue.poll();
        sb.append(num).append(">");

        System.out.println(sb);
    }
}