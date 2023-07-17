package level15;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        if (a < b) {
            Long tem = a;
            a = b;
            b = tem;
        }

        Long result = (a * b) / compute(a, b);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();

    }

    private static Long compute(Long a, Long b) {
        Long num;
        while (b != 0) {
            num = a % b;
            a = b;
            b = num;
        }
        return a;
    }
}
