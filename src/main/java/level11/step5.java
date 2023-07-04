package level11;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Long num = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(num * num * num));
        bw.newLine();
        bw.write(String.valueOf("3"));

        bw.flush();
        bw.close();
        bf.close();
    }
}
