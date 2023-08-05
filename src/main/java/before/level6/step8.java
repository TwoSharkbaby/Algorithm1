package before.level6;

import java.io.*;
import java.util.StringTokenizer;

public class step8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(bf.readLine());
            String word = st.nextToken();
            boolean connected = true;
            for (int j = 0; j < word.length(); j++) {
                char wordChar = word.charAt(j);
                for (int k = j + 1; k < word.length(); k++) {
                    if (wordChar == word.charAt(k)) {
                        if (k == j + 1) {
                            j++;
                            continue;
                        } else {
                            connected = false;
                        }
                    }
                }
            }
            if (connected == true) {
                result++;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }
}
