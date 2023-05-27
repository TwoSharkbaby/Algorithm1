package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];
        int val = 0;
        int numberth = 0;

        for (int i=0; i < num.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            num[i] = Integer.parseInt(st.nextToken());
            if (val < num[i]) {
                val = num[i];
                numberth = i+1;
            }
        }

        bw.write(String.valueOf(val));
        bw.newLine();
        bw.write(String.valueOf(numberth));
        bw.flush();
        bw.close();
        bf.close();

    }
}
