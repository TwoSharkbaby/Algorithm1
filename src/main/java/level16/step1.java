package level16;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        bf.close();

    }

}
