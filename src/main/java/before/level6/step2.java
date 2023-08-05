package before.level6;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] chess = new int[6];
        int[] num = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];

        for (int i = 0; i < chess.length; i++) {
            chess[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < chess.length; i++) {
            if (chess[i] == num[i]) {
                result[i] = 0;
            } else {
                result[i] = num[i] - chess[i];
            }
        }

        for (int k = 0; k < result.length; k++) {
            bw.write(result[k] + " ");
        }

        bw.flush();
        bw.close();

    }
}
