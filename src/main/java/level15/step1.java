package level15;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int t = Integer.parseInt(st.nextToken());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a < b) {
                int tem = a;
                a = b;
                b = tem;
            }
            int result = (a * b) / compute(a, b);
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }

    private static int compute(int a, int b) {
        int num;
        while (b != 0) {
            num = a % b;
            a = b;
            b = num;
        }
        return a;
    }
}
