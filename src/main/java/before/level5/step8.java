package before.level5;

import java.io.*;
import java.util.StringTokenizer;

public class step8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = 0;

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
