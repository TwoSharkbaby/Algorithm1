package level8;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int total = 1;
        boolean next = true;
        int result = 1;

        while (next && (num != 1)) {
            if (num <= total) {
                next = false;
                break;
            }
            total += 6 * result;

            result++;
        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        bf.close();
    }
}
