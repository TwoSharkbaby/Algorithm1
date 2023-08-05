package before.level15;

import java.io.*;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int numerator = a * d + c * b;
        int denominator = b * d;

        int result = compute(numerator, denominator);
        numerator /= result;
        denominator /= result;

        bw.write(String.valueOf(numerator + " " + denominator));
        bw.flush();
        bw.close();
        bf.close();

    }

    private static int compute(int a, int b) {
        if (a <= b) {
            int tem = a;
            a = b;
            b = tem;
        }

        if (b == 0) {
            return a;
        }
        return compute(b, a % b);
    }
}
