package before.level19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class step5 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        int startNum = 1;
        boolean result = true;
        while (n-- > 0) {
            st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num >= startNum) {
                for (int i = startNum; i <= num; i++) {
                    stack.push(i);
                    startNum++;
                    sb.append("+" + '\n');
                }
            } else if (stack.peek() != num) {
                System.out.println("NO");
                result = false;
                break;
            }
            stack.pop();
            sb.append("-" + '\n');
        }

        if (result) {
            System.out.println(sb);
        }

        bf.close();
    }
}
