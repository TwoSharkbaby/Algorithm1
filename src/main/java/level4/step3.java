package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int total = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int firstNum = Integer.parseInt(st.nextToken());
        int[] answer = {firstNum, firstNum};
        int tem;

        for (int i=0; i < total-1; i++) {
            tem = Integer.parseInt(st.nextToken());
            if ( answer[0] > tem ) {
                answer[0] = tem;
            }
            if ( answer[1] < tem) {
                answer[1] = tem;
            }
        }

        bw.write(answer[0]+" "+answer[1]);
        bw.flush();
        bw.close();
        bf.close();

    }
}
