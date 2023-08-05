package before.level4;

import java.io.*;
import java.util.StringTokenizer;

public class step8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] check = new int[42];
        int count = 0;

        for (int i=0; i<42; i++){
            check[i] = 0;
        }

        for (int i=0; i<10; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken()) % 42;
            check[num] = 1;
        }

        for (int i=0; i<42; i++){
            if (check[i] == 1){
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
