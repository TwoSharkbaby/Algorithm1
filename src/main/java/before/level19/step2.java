package before.level19;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                arr.remove(arr.size() - 1);
            } else {
                arr.add(num);
            }
        }

        for (int num : arr) {
            sum += num;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        bf.close();
    }
}
