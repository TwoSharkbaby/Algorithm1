package before.level3;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=1; i <= num; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String pre = "Case #" + i + ": ";
            String c = pre + String.valueOf((a + b));
            bw.write(c);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
