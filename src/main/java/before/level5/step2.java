package before.level5;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();

        char[] chars = word.toCharArray();

        bw.write(String.valueOf(chars.length));

        bw.flush();
        bw.close();

    }
}
