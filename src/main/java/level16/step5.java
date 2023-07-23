package level16;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {

    static int[][] arr = new int[30][30];

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(factorial(m, n)).append('\n');
        }

        System.out.println(sb);

    }

    static int factorial(int n, int m) {
        if (arr[n][m] > 0) {
            return arr[n][m];
        }
        if (n == m || m == 0) {
            return arr[n][m] = 1;
        }
        return factorial(n - 1, m - 1) + factorial(n - 1, m);
    }
}
