package level9;

import java.io.*;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            int sum = 1;
            String result = num + " = 1";
            if (num == -1) {
                break;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    result += " + " + i;
                    sum += i;
                }
            }

            if (num == sum) {
                bw.write(result);
            } else {
                bw.write(String.valueOf(num) + " is NOT perfect.");
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
