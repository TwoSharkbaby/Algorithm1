package level13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[5];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            num[i] = Integer.parseInt(st.nextToken());
            sum += num[i];
        }

        Arrays.sort(num);

        int average = sum / num.length;
        int center = num[num.length / 2];

        bw.write(String.valueOf(average));
        bw.newLine();
        bw.write(String.valueOf(center));
        bw.flush();
        bw.close();
        bf.close();

    }
}
