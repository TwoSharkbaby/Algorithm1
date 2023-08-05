package before.level5;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i == num-1) {
                bw.write(chars[i]);
                break;
            }
        }

        bw.flush();
        bw.close();

    }
}
