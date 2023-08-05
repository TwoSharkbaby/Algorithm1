package before.level15;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static boolean[] prime = new boolean[246913];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        computePrime();

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }
            int count = 0;
            for (int i = n + 1; i <= n * 2; i++) {
                if (!prime[i]) {
                    count++;
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }

    private static void computePrime() {
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
