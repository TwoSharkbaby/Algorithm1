package levle12;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int count = 1;
        int result = 666;

        while (count != num) {
            result++;
            if (check(result) == true) {
                count++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }

    static boolean check(int result) {
        String n = String.valueOf(result);
        for (int i = 0; i < n.length() - 2; i++) {
            if (n.charAt(i) == '6' && n.charAt(i + 1) == '6' && n.charAt(i + 2) == '6') {
                return true;
            }
        }
        return false;
    }

}
