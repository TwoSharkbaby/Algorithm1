package level18;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean next = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
                mod = arr[i];
                next = true;
            } else if (max == count && next == true) {
                mod = arr[i];
                next = false;
            }
        }

        bw.write(String.valueOf((int) Math.round(sum / n)) + '\n');
        bw.write(String.valueOf(arr[arr.length / 2]) + '\n');
        bw.write(String.valueOf(mod) + '\n');
        bw.write(String.valueOf(arr[arr.length - 1] - arr[0]));
        bw.flush();
        bw.close();
        bf.close();
    }
}
