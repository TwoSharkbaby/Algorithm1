package level8;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int days = 0;

        days = (int) Math.ceil((double)(v - b) / (double)(a - b));

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();
        bf.close();
    }
}
