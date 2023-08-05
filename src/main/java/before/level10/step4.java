package before.level10;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Long num = (Long.parseLong(st.nextToken()));

        bw.write(String.valueOf(num*4));
        bw.flush();
        bw.close();

    }
}
