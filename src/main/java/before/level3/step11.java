package before.level3;

import java.io.*;
import java.util.StringTokenizer;

public class step11 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            }

            String c = String.valueOf((a + b));
            bw.write(c);
            bw.newLine();

        }

        bw.flush();
        bw.close();

    }
}
