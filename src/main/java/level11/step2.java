package level11;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(num));
        bw.newLine();
        bw.write(String.valueOf("1"));

        bw.flush();
        bw.close();
        bf.close();
    }
}
