package level14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> s = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            s.put(st.nextToken(), 0);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            if (s.containsKey(st.nextToken())) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        bf.close();

    }
}
