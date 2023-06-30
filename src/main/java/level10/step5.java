package level10;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int xMax = -10000;
        int xMin = 10000;
        int yMax = -10000;
        int yMin = 10000;
        int result = 0;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x > xMax) {
                xMax = x;
            }
            if (x < xMin) {
                xMin = x;
            }
            if (y > yMax) {
                yMax = y;
            }
            if (y < yMin) {
                yMin = y;
            }
        }

        result = (xMax - xMin) * (yMax - yMin);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
