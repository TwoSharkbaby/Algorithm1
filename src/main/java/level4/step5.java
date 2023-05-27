package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int goal = Integer.parseInt(st.nextToken());
        for (int i=0; i < goal; i++) {

            st = new StringTokenizer(bf.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            for (int j = first -1; j < last; j++) {
                basket[j] = num;
            }
        }

        for(int k = 0; k < basket.length; k++) {
            bw.write(basket[k] + " ");
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
