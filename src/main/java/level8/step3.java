package level8;

import java.io.*;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int repitation = Integer.parseInt(st.nextToken());

        for (int i = 0; i < repitation; i++) {
            st = new StringTokenizer(bf.readLine());
            int rest = Integer.parseInt(st.nextToken());
            int quarter = 0;
            int dime = 0;
            int nickel = 0;
            int penny = 0;
            while (rest != 0) {
                if (25 <= rest) {
                    quarter++;
                    rest = rest - 25;
                } else if (10 <= rest) {
                    dime++;
                    rest = rest - 10;
                } else if (5 <= rest) {
                    nickel++;
                    rest = rest - 5;
                } else {
                    penny++;
                    rest = rest - 1;
                }
            }
            bw.write(String.valueOf(quarter + " " + dime + " " + nickel + " " + penny));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
