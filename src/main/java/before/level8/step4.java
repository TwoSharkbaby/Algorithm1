package before.level8;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int repitation = Integer.parseInt(st.nextToken());
        int result = 2;

        for (int i=0; i < repitation; i++) {
            result += (int) (Math.pow(2, i));
        }

        bw.write(String.valueOf((int) (Math.pow(result, 2))));

        bw.flush();
        bw.close();
        bf.close();
    }
}
