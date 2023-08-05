package before.level3;

import java.io.*;
import java.util.StringTokenizer;

public class step12 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line;

        while ((line = bf.readLine()) != null) {
            st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String c = String.valueOf((a + b));
            bw.write(c);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
