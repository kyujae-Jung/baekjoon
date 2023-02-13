import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = (br.readLine());

        int length = s.length();
        String[] arr = new String[length];

        for(int i=0; i<length; i++){
            arr[i] = s.substring(i,length);

        }

        Arrays.sort(arr);
        for(String result : arr){
            bw.write(result);
            bw.write('\n');
        }
        bw.flush();
    }
}