package level12;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] arr = new boolean[n][m];
        int result = 64;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String board = st.nextToken();
            for (int j = 0; j < m; j++) {
                if (board.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                result = Math.min(result, compute(i, j, arr));
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }

    private static int compute(int x, int y, boolean[][] arr) {
        int count = 0;
        boolean color = true;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (!arr[i][j] == color) {
                    count++;
                }
                if (color == true) {
                    color = false;
                } else {
                    color = true;
                }
            }
            if (color == true) {
                color = false;
            } else {
                color = true;
            }
        }

        return Math.min(count, 64 - count);
    }
}
