package before.level13;

import java.io.*;
import java.util.StringTokenizer;

public class step10 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        String[][] arr = new String[num][2];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        for (int i = 1; i <= 200; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == Integer.parseInt(arr[j][0])) {
                    bw.write(arr[j][0] + " " + arr[j][1]);
                    bw.newLine();
                }
            }
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
