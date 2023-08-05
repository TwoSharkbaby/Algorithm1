package before.level4;

import java.io.*;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] basket = new int[Integer.parseInt(st.nextToken())];
        int count = Integer.parseInt(st.nextToken());
        int tem;

        for (int i=0; i < basket.length; i++){
            basket[i] = i+1;
        }

        for (int i=0; i < count; i++) {
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;

            if (a != b) {
                tem = basket[a];
                basket[a] = basket[b];
                basket[b] = tem;
            }

        }

        for(int k = 0; k < basket.length; k++) {
            bw.write(basket[k] + " ");
        }

        bw.flush();
        bw.close();

    }
}
