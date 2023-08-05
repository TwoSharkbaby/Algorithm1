package before.level14;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] card = new int[Integer.parseInt(st.nextToken())];

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < card.length; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);

        st = new StringTokenizer(bf.readLine());
        int compareCard = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < compareCard; i++) {
            int result = binarySearch(Integer.parseInt(st.nextToken()), card);
            if (result != -1) {
                bw.write(String.valueOf(1 + " "));
            } else {
                bw.write(String.valueOf(0 + " "));
            }
        }

        bw.flush();
        bw.close();
        bf.close();

    }

    private static int binarySearch(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
