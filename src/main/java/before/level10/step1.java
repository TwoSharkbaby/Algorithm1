package before.level10;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int height = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int width = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(height*width));
        bw.flush();
        bw.close();
        bf.close();
    }
}
