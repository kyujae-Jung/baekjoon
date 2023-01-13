import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for(int i=0; i<9; i++){     //arr.length 대신 숫자(9)를 적는 것이 계산을 줄일 수 있음
            arr[i] = Integer.parseInt(br.readLine());  //BufferedReader의 기본 반환값이 문자이므로 Integer.parseInt()로 int형으로 형변환
        }

        int max =0;
        int count = 0;
        int index=0;

        for(int value : arr){
            count++;
            if(value>max){
                max =value;
                index =count;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}