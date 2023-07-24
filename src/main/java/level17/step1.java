package level17;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] n = new int[Integer.parseInt(st.nextToken())];
        int result = 0;

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(n);

        result = n[0] * n[n.length - 1];

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();

    }

}
