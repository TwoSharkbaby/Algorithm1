package level14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String name = st.nextToken();
            String recode = st.nextToken();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, recode);
            }
        }

        ArrayList<String> result = new ArrayList<>(map.keySet());
        Collections.sort(result, Collections.reverseOrder());

        for (String name : result) {
            bw.write(name);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
