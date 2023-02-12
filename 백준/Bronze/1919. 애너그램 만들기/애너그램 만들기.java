import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        String s1 = br.readLine();
        String s2 = br.readLine();

        // 단어별로 알파벳 담을 배열
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0; i<s1.length(); i++)
            arr1[s1.charAt(i)-'a'] ++;

        for(int i=0; i<s2.length(); i++)
            arr2[s2.charAt(i)-'a'] ++;

        // 각 알파벳 별로 차이만큼(절댓값) 제거하기
        for(int i=0; i<26; i++)
            if(arr1[i] != arr2[i])
                count += Math.abs(arr1[i] - arr2[i]);

        System.out.println(count);
    }
}