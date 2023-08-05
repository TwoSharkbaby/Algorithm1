package before.level5;

import java.io.*;
import java.util.StringTokenizer;

public class step9 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String fir = st.nextToken();
        String sec = st.nextToken();
        int[] num1 = new int[3];
        int[] num2 = new int[3];
        int final1 = 0;
        int final2 = 0;

        int j = 2;
        for (int i = 0; i < num1.length; i++) {
            num1[j] = Integer.parseInt(String.valueOf(fir.charAt(i)));
            num2[j] = Integer.parseInt(String.valueOf(sec.charAt(i)));
            j--;
        }

        final1 = num1[0] * 100 + num1[1] * 10 + num1[2];
        final2 = num2[0] * 100 + num2[1] * 10 + num2[2];

        if (final1 > final2) {
            bw.write(String.valueOf(final1));
        } else {
            bw.write(String.valueOf(final2));
        }

        bw.flush();
        bw.close();

    }
}
