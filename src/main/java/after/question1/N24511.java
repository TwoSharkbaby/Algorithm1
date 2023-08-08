package after.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N24511 {

    static char[] result;

    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        int n = Integer.parseInt(st.nextToken());
        boolean[] flag = new boolean[n];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            flag[i] = Integer.parseInt(st.nextToken()) == 0;
        }
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (flag[i]) {
                dq.addLast(x);
            }
        }

        st = new StringTokenizer(bf.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < m; i++) {
            int y = Integer.parseInt(st.nextToken());
            dq.addFirst(y);
            sb.append(dq.getLast() + " ");
            dq.removeLast();
        }

        System.out.println(sb);
        bf.close();
    }
}
