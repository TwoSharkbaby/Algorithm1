package before.level15;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[Integer.parseInt(st.nextToken())];

        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int distance = arr[i + 1] - arr[i];
            num = compute(distance, num);
        }

        int result = (arr[arr.length - 1] - arr[0]) / num + 1 - (arr.length);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();

    }

    private static int compute(int a, int b) {
        while (b != 0) {
            int num = a % b;
            a = b;
            b = num;
        }
        return a;
    }

}
