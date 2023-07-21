package level15;

import java.io.*;
import java.util.StringTokenizer;

public class step9 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long n = Long.parseLong(st.nextToken());
        n = (long) Math.floor(Math.sqrt(n));

        bw.write(String.valueOf(n));
        bw.newLine();

        bw.flush();
        bw.close();
        bf.close();

    }
}
