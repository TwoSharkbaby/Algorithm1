package level5;

import java.io.*;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        for (int i = 0; i <num; i++) {
            st = new StringTokenizer(bf.readLine());
            String word = st.nextToken();
            char[] chars = word.toCharArray();
            bw.write(chars[0]+""+chars[chars.length-1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
