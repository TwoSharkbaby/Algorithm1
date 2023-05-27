package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step10 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=1; i <= num; i++) {
            String a = "";
            for (int j=1; j+i <= num; j++) {
                a += " ";
            }
            for (int k=1; k <= i; k++) {
                a += "*";
            }
            bw.write(a);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
