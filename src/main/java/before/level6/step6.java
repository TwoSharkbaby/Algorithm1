package before.level6;

import java.io.*;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int repetition = Integer.parseInt(st.nextToken());

        for (int i = 0; i < repetition; i++) {
            st = new StringTokenizer(bf.readLine());
            int[] count = new int[Integer.parseInt(st.nextToken())];
            int total = 0;
            int pass = 0;
            double doubleResult = 0;

            for (int j = 0; j < count.length; j++) {
                count[j] = Integer.parseInt(st.nextToken());
                total += count[j];
            }
            for (int j = 0; j < count.length; j++) {
                int average = total / count.length;
                if (count[j] > average) {
                    pass++;
                }
            }

            doubleResult = (double) pass / count.length * 100;
            String stringResult = String.format("%.3f", doubleResult) + "%";

            bw.write(stringResult);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
