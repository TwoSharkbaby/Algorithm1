package level7;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[][] result = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < result.length; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = result[i][j] + Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                bw.write(String.valueOf(result[i][j]) + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
