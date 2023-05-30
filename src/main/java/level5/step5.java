package level5;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        char[] chars = word.toCharArray();
        int total = 0;

        for (int i=0; i < num; i++){
            total += Character.getNumericValue(chars[i]);
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();

    }
}
