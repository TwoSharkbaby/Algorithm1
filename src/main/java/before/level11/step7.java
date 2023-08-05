package before.level11;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int c = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int n0 = Integer.parseInt(st.nextToken());
        int result = (a1 * n0 + a0) <= (c * n0) && c >= a1 ? 1 : 0;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }
}
