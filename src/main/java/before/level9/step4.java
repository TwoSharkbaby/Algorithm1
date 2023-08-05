package before.level9;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j = 2; j <= num; j++) {
                if (num % j == 0) {
                    sum += j;
                }
            }
            if (num == sum) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }
}
