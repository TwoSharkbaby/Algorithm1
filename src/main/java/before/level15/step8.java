package before.level15;

import java.io.*;
import java.util.StringTokenizer;

public class step8 {

    public static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        computePrime();

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 2; j <= num / 2; j++) {
                if (!prime[j] && !prime[num - j]) {
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
