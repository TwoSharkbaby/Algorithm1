package after.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2477 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        sb.append((int) (Math.pow(2, n) - 1)).append('\n');
        compute(n, 1, 2, 3);

        System.out.println(sb);
        bf.close();
    }

    private static void compute(int n, int start, int mid, int to) {
        if (n == 1) {
            sb.append(start + " " + to + '\n');
            return;
        }
        compute(n - 1, start, to, mid);
        sb.append(start + " " + to + '\n');
        compute(n - 1, mid, start, to);
    }

}
