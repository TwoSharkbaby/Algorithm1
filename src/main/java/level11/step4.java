package level11;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Double n = Double.parseDouble(st.nextToken());
        Long result = (long) ((n/2)*(n-1));

        bw.write(String.valueOf(result));
        bw.newLine();
        bw.write(String.valueOf("2"));

        bw.flush();
        bw.close();
        bf.close();
    }
}
