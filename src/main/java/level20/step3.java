package level20;

import java.io.*;
import java.util.*;

public class step3 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        sb.append("<");
        int num = 0;
        while (true) {
            num++;
            if (num % k != 0) {
                int tep = deque.poll();
                deque.offer(tep);
            } else {
                sb.append(deque.poll());
                if (!deque.isEmpty()) {
                    sb.append(", ");
                }
            }
            if (deque.isEmpty()) {
                sb.append(">");
                break;
            }
        }

        System.out.println(sb);
        bf.close();
    }
}
