package before.level6;

import java.io.*;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int repetition = num * 2 - 1;
        int rep;
        int star;

        for (int i = 1; i <= repetition; i++) {

            if (i > num) {
                rep = i - num;
            } else {
                rep = num - i;
            }

            if (i < num){
                star = i*2-1;
            } else {
                star = (num-rep)*2-1;
            }

            for (int j = 0; j < rep; j++) {
                bw.write(" ");
            }

            for (int k = 0; k < star; k++) {
                bw.write("*");
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
