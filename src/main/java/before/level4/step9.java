package before.level4;

import java.io.*;
import java.util.StringTokenizer;

public class step9 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(bf.readLine());
            int first = Integer.parseInt(st.nextToken()) - 1;
            int last = Integer.parseInt(st.nextToken()) - 1;

            if (first != last) {
                int t = 0;
                int[] num = new int[last - first + 1];

                for (int j = 0; j < num.length; j++) {
                    num[j] = basket[last - j];
                }

                for (int k = first; k <= last; k++) {
                    basket[k] = num[t];
                    t++;
                }


            }

        }

        for (int k = 0; k < basket.length; k++) {
            bw.write(basket[k] + " ");
        }

        bw.flush();
        bw.close();

    }
}
