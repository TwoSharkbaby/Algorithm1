package level5;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(bf.readLine());
            int repetition = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            char[] chars = word.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < repetition; k++) {
                    bw.write(chars[j]);
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
