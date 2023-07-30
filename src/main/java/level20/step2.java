package level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        if (n == 1) {
            System.out.println(1);
        } else {
            while (!deque.isEmpty()) {
                deque.poll();
                Integer num1 = deque.poll();
                deque.offer(num1);
                if (deque.size() == 1) {
                    sb.append(deque.poll());
                    break;
                }
            }
            System.out.println(sb);
        }

        bf.close();
    }
}
