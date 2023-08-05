package before.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class step7 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(bf.readLine());
            String p = st.nextToken();
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(bf.readLine());
            String stringArr = st.nextToken();

            String numbers = stringArr.replaceAll("[\\[\\]\\s]", "");
            String[] numberStrings = numbers.split(",");
            LinkedList<Integer> arr = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                arr.add(Integer.parseInt(numberStrings[i]));
            }

            boolean reverse = false;
            boolean print = true;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == 'R') {
                    reverse = !reverse;
                } else {
                    if (arr.size() == 0) {
                        sb.append("error").append('\n');
                        print = false;
                        break;
                    } else {
                        if (reverse) {
                            arr.removeLast();
                        } else {
                            arr.removeFirst();
                        }
                    }
                }
            }

            if (print) {
                sb.append("[");
                while (!arr.isEmpty()) {
                    if (reverse) {
                        sb.append(arr.removeLast());
                    } else {
                        sb.append(arr.removeFirst());
                    }
                    if (!arr.isEmpty()) {
                        sb.append(",");
                    }
                }

                sb.append("]").append('\n');
            }
        }

        System.out.println(sb);
        bf.close();
    }
}
