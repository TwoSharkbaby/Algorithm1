package level7;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] board = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < board.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (max < board[i][j]) {
                    max = board[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf((x+1) + " " + (y+1)));
        bw.flush();
        bw.close();
        bf.close();
    }
}
