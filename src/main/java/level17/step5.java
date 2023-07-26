package level17;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class step5 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String word = st.nextToken();
            if (word.length() >= m) {
                hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = hashMap.keySet().stream().collect(Collectors.toList());
        words.sort((o1, o2) -> {
            int c1 = hashMap.get(o1);
            int c2 = hashMap.get(o2);

            if (c1 == c2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o2.length() - o1.length();
            }
            return c2 - c1;
        });

        for (String result : words) {
            bw.write(result);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
