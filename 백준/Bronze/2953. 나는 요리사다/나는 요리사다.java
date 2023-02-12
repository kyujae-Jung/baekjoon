import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[5];
        int max = 0;
        int rank = 0;

        for (int i =0 ; i < 5; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sum[i] = a + b + c + d;
        }

        for (int i =0 ; i < 5; i++) {
            if (sum[i] > max) {
                max = sum[i];
                rank = i+1;
            }
        }

        System.out.println(rank + " " +max);
    }
}