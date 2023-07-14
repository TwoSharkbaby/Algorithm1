package level14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(bf.readLine());
            String name = st.nextToken();
            map.put(name, i);
            arr[i] = name;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            String find = st.nextToken();
            try {
                int findNum = Integer.parseInt(find);
                bw.write(arr[findNum]);
                bw.newLine();
            } catch (NumberFormatException e) {
                bw.write(String.valueOf(map.get(find)));
                bw.newLine();

            }
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
