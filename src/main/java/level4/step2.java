package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int total = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        String answer = "";
        int tem;

        for (int i=0; i < total; i++) {
            tem = Integer.parseInt(st.nextToken());
            if ( num > tem ) {
                answer += tem + " ";
            }
        }

        bw.write(answer);
        bw.flush();
        bw.close();
        bf.close();

    }
}
