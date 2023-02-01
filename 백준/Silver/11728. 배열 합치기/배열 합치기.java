import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
        int size=n+m;
        int[] result=new int[size];

        String[] arrayA=br.readLine().split(" ");
        String[] arrayB=br.readLine().split(" ");

        int idx=0;
        for(int i=0;i<n;i++) { // 배열 A 넣기
            result[idx++]=Integer.parseInt(arrayA[i]);
        }
        for(int i=0;i<m;i++) { // 배열 B 넣기
            result[idx++]=Integer.parseInt(arrayB[i]);
        }
        Arrays.sort(result); // 오름차순 정렬

        for(int r:result) {
            bw.write(String.valueOf(r)+" ");
        }

        bw.flush();
        bw.close();
    }
}