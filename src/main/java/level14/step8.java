package level14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class step8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String s = st.nextToken();
        char[] arr = s.toCharArray();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String word = String.valueOf(arr[i]);
            map.put(word, 0);
            for (int j = i + 1; j < arr.length; j++) {
                word += arr[j];
                map.put(word, 0);
            }
        }

        bw.write(String.valueOf(map.size()));
        bw.flush();
        bw.close();
        bf.close();

    }
}
