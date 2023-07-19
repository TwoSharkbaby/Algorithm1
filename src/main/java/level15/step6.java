package level15;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = m; i <= n; i++) {
            BigInteger bigInteger = new BigInteger(String.valueOf(i));
            if (bigInteger.isProbablePrime(10)) {
                bw.write(String.valueOf(bigInteger));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
