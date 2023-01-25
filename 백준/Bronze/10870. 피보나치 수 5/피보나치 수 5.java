import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fibo(N));
    }

    static int fibo(int N){
        if(N==0) return 0;  //첫번째 두번째 수는 0과 1로 고정되어 있다.
        if(N==1) return 1;
        return fibo(N-1) + fibo(N-2);
    }
}