package after.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class N28279 {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        while (n-- > 0) {
            st = new StringTokenizer(bf.readLine());
            switch (st.nextToken()) {
                case "1":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    int num = deque.isEmpty() ? -1 : deque.pollFirst();
                    sb.append(num).append('\n');
                    break;
                case "4":
                    int num1 = deque.isEmpty() ? -1 : deque.pollLast();
                    sb.append(num1).append('\n');
                    break;
                case "5":
                    sb.append(deque.size()).append('\n');
                    break;
                case "6":
                    int num2 = deque.isEmpty() ? 1 : 0;
                    sb.append(num2).append('\n');
                    break;
                case "7":
                    int num3 = deque.isEmpty() ? -1 : deque.peekFirst();
                    sb.append(num3).append('\n');
                    break;
                case "8":
                    int num4 = deque.isEmpty() ? -1 : deque.peekLast();
                    sb.append(num4).append('\n');
                    break;
            }
        }

        System.out.println(sb);
        bf.close();
    }
}
