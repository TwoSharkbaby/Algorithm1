package before.level9;

import java.io.*;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        boolean next = true;

        while (next) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                    n = n / i;
                    break;
                }
            }
            if (n == 1) {
                next = false;
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
