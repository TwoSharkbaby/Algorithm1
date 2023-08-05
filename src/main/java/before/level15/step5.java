package before.level15;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(bf.readLine());
            Long n = Long.parseLong(st.nextToken());
            BigInteger bigInteger = new BigInteger(String.valueOf(n));
            if (bigInteger.isProbablePrime(10)) {
                bw.write(String.valueOf(bigInteger));
                bw.newLine();
            } else {
                bw.write(String.valueOf(bigInteger.nextProbablePrime()));
                bw.newLine();
            }

        }

        bw.flush();
        bw.close();
        bf.close();

    }

}
