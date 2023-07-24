package level17;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> chat = new HashMap<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String massage = st.nextToken();
            if (massage.equals("ENTER")) {
                result += chat.size();
                chat.clear();
            } else {
                chat.put(massage, 0);
            }
        }
        result += chat.size();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }
}
