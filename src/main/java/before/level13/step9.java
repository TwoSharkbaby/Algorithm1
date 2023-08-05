package before.level13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step9 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        String[] arr = new String[num];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        bw.write(arr[0]);
        bw.newLine();

        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                bw.write(arr[i]);
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
