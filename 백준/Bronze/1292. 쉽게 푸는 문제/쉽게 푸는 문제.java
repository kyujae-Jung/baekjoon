import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[1001];

        int sum = 0;
        int count = 1;
        for (int i=0; i<1001; i++){
            for (int j=0; j<i; j++){
                if (count == 1001) break;
                arr[count] = i;
                count++;
            }
        }
        for (int i=N; i<=M; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}