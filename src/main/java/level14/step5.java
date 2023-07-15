package level14;

import java.io.*;
import java.util.*;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            map.put(st.nextToken(), 0);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            String key = st.nextToken();
            if (map.containsKey(key)) {
                count++;
                result.add(key);
            }
        }

        Collections.sort(result);
        bw.write(String.valueOf(count));
        bw.newLine();

        for (String resultString : result) {
            bw.write(resultString);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
