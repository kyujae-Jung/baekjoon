import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int cnt = 0;   //반복 횟수
        int copy = a;  //처음 입력값을 복사

        do{
            a = ((a%10)*10) + (((a/10) + (a%10))%10);  //새로운 수의 10의 자리수 + 새로운 수의 1의 자리수
            cnt++;
        }while (copy!=a);

        System.out.println(cnt);
    }
}
