import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>();
        while (N > 0) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String a = st.nextToken();
            if (a.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
            N--;
        }
        for (Iterator<String> itr = ((TreeSet<String>) set).descendingIterator(); itr.hasNext();) {
            sb.append(itr.next()).append("\n");
        }
        System.out.println(sb);
    }
}