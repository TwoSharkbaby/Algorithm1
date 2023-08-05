package after.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        Queue<Integer> waitingLine = new LinkedList<>();
        Stack<Integer> addSpace = new Stack<>();

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            waitingLine.offer(Integer.parseInt(st.nextToken()));
        }

        int start = 1;

        while (!waitingLine.isEmpty()) {
            if (waitingLine.peek() == start) {
                waitingLine.poll();
                start++;
            } else if (!addSpace.isEmpty() && addSpace.peek() == start) {
                addSpace.pop();
                start++;
            } else {
                addSpace.push(waitingLine.poll());
            }
        }
        while (!addSpace.isEmpty()) {
            if (addSpace.peek() == start) {
                addSpace.pop();
                start++;
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
