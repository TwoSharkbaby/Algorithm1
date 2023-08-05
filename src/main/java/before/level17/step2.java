package before.level17;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int result = (int) Math.pow(2, n);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();

    }

}
