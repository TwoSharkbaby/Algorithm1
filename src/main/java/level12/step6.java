package level12;

import java.io.*;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int result = compute(num);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }

    private static int compute(int num) {
        int count = num;
        int pack5 = 5;
        int pack3 = 3;

        for (int i = 0; i <= num / pack5; i++) {
            for (int j = 0; j <= num / pack3; j++) {
                if (num == (pack5 * i) + (pack3 * j)) {
                    count = Math.min(count, i + j);
                }
            }
        }

        return num == count ? -1 : count;
    }

}
