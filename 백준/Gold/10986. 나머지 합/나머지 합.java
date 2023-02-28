import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] arr1 = new long[N];
        long[] arr2 = new long[M];
        long answer = 0;
        arr1[0] = sc.nextInt();
        for(int i=1; i<N; i++){
            arr1[i] = arr1[i-1] + sc.nextInt();
        }
        for(int i=0; i<N; i++){
            int remainder = (int)(arr1[i]%M);
            if(remainder == 0) answer++;
            arr2[remainder]++;
        }
        for(int i=0; i<M; i++){
            if(arr2[i] > 1){
                answer = answer + (arr2[i] * (arr2[i]-1) / 2);
            }
        }
        System.out.println(answer);
    }
}