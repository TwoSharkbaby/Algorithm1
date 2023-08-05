package before.level13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step5 {

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

        for (int i = 0; i < num.length; i++) {
            bw.write(String.valueOf(num[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
