import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] arr = new int[10];

        for(int i=0; i<10; i++)
            arr[i] = Integer.parseInt(br.readLine());

        for(int i=0; i<10; i++) {
            sum += arr[i];

            if(Math.abs((sum-arr[i])-100) < sum-100) {
                sum = sum-arr[i];
                break;
            }
        }
        System.out.println(sum);
    }
}