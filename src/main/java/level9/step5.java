package level9;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> result = new ArrayList<>();
        int resultSum = 0;

        for (int i = m; i <= n; i++) {
            int sum = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                result.add(sum);
                resultSum += sum;
            }
        }

        if (result.size() == 0) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(resultSum));
            bw.newLine();
            bw.write(String.valueOf(result.get(0)));
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}
