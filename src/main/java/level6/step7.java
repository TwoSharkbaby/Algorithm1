package level6;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int repetition = Integer.parseInt(st.nextToken());



        bw.newLine();


        bw.flush();
        bw.close();
        bf.close();

    }
}
