package level20;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();

        while (n-- > 0) {
            st = new StringTokenizer(bf.readLine());
            switch (st.nextToken()) {
                case "push":
                    deque.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Integer num1 = deque.poll();
                    if (num1 == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(num1).append('\n');
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    Integer num2 = deque.peek();
                    if (num2 == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(num2).append('\n');
                    }
                    break;
                case "back":
                    Integer num3 = deque.peekLast();
                    if (num3 == null) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(num3).append('\n');
                    }
                    break;
            }
        }

        System.out.println(sb);
        bf.close();
    }
}
