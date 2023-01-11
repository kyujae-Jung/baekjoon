import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //BufferedReader로 a는 int로, b는 String으로 입력받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        br.close();

        //b는 charAt()으로 각 자리수를 참조한다(문자열의 인덱스 위치에 있는 문자값을 반환한다).
        System.out.println(a*(b.charAt(2) - '0'));
        System.out.println(a*(b.charAt(1) - '0'));
        System.out.println(a*(b.charAt(0) - '0'));
        System.out.println(a*Integer.parseInt(b));
    }
}