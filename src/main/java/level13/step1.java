package level13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] num = new int[Integer.parseInt(st.nextToken())];

        for (int i = 0; i < num.length; i++) {
            st = new StringTokenizer(bf.readLine());
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        for (int n : num) {
            bw.write(String.valueOf(n));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
