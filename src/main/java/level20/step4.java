package level20;

import java.io.*;
import java.util.*;

public class step4 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            LinkedList<int[]> deque = new LinkedList<>();

            st = new StringTokenizer(bf.readLine());
            for (int i = 0; i < n; i++) {
                deque.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!deque.isEmpty()) {
                int[] front = deque.poll();
                boolean isMax = true;

                for (int i = 0; i < deque.size(); i++) {
                    if (front[1] < deque.get(i)[1]) {
                        deque.offer(front);
                        for (int j = 0; j < i; j++) {
                            deque.offer(deque.poll());
                        }
                        isMax = false;
                        break;
                    }
                }
                if (isMax == false) {
                    continue;
                }
                count++;
                if (front[0] == m) {
                    break;
                }
            }
            sb.append(count).append('\n');

        }

        System.out.println(sb);
        bf.close();
    }

}
