package levle12;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] num = new int[Integer.parseInt(st.nextToken())];
        int sum = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);
        int result = 0;

        for (int i = 0; i < num.length - 2; i++) {
            for (int j = i + 1; j < num.length - 1; j++) {
                for (int k = i + 2; k < num.length; k++) {
                    int temp = num[i] + num[j] + num[k];
                    if (temp > result && temp <= sum) {
                        result = temp;
                    }
                }
            }

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();

    }
}
