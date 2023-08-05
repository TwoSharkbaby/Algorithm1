package before.level13;

import java.io.*;
import java.util.*;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[][] arr = new int[num][2];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, ((o1, o2) -> {
            return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
        }));

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i][0] + " " + arr[i][1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
