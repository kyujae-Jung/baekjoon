import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i=0; i<N; i++){
            arr[i] = br.readLine();
        }

        int row = 0;
        int col = 0;

        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                if (arr[i].charAt(j) == '.'){
                    if (j+1 < N && arr[i].charAt(j+1) == '.'){
                        if (j+2 >= N || (j+2 < N && arr[i].charAt(j+2) == 'X')){
                            row++;
                        }
                    }
                    if (i+1 < N && arr[i+1].charAt(j) == '.'){
                        if (i+2 >= N || (i+2 < N && arr[i+2].charAt(j) == 'X')){
                            col++;
                        }
                    }
                }
            }
        }
        System.out.println(row +" "+ col);
    }
}