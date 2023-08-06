package after.question1;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class N2346 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        Deque<int[]> deque = new ArrayDeque<>();
        int[] arr = new int[n];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int direction = arr[0];
        sb.append("1 ");
        for (int i = 1; i < n; i++) {
            deque.add(new int[]{i + 1, arr[i]});
        }

        while (!deque.isEmpty()) {
            if (direction > 0) {
                for (int i = 1; i < direction; i++) {
                    deque.add(deque.poll());
                }
                int[] next = deque.poll();
                direction = next[1];
                sb.append(next[0] + " ");
            } else {
                for (int i = direction; i < -1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                int[] next = deque.pollLast();
                direction = next[1];
                sb.append(next[0] + " ");
            }
        }

            System.out.println(sb);
        bf.close();
    }
}
