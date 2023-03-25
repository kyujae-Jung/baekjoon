import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int length = str.length();
        int[] arr = new int[length];

        for (int i=0; i<length; i++){
            arr[i] = str.charAt(i);
            if(arr[i]-68<0){
                System.out.print((char)(arr[i]+23));
            }
            else{
                System.out.print((char)(arr[i]-3));
            }
        }
    }
}