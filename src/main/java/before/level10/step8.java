package before.level10;

import java.io.*;
import java.util.StringTokenizer;

public class step8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num[] = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        int result = 0;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int tmp = num[j];
                    num[j] = num[i];
                    num[i] = tmp;
                }
            }
        }

        if (num[2] >= (num[0] + num[1])) {
            num[2] = num[0] + num[1] - 1;
        }

        for (int i = 0; i < num.length; i++) {
            result += num[i];
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();

    }
}
