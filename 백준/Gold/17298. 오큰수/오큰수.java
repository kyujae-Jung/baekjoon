import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] NGE = new int[N];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);
        for(int i=1; i<N; i++){
            while (!myStack.isEmpty() && arr[myStack.peek()] < arr[i]){
                NGE[myStack.pop()] = arr[i];
            }
            myStack.push(i);
        }
        while (!myStack.empty()){
            NGE[myStack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            bw.write(NGE[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}