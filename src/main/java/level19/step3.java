package level19;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class step3 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String word = st.nextToken();
            char[] charPS = word.toCharArray();
            int left = 0;
            for (char ps : charPS) {
                if (ps == '(') {
                    left++;
                } else {
                    left--;
                }
                if (left == -1) {
                    break;
                }
            }
            if (left != 0) {
                bw.write("NO");
                bw.newLine();
            } else {
                bw.write("YES");
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
