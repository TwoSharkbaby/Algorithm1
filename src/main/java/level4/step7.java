package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] check = new int[30];

        for (int i=0; i<30; i++){
            check[i] = 0;
        }

        for (int i=0; i<28; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            check[Integer.parseInt(st.nextToken())-1] = 1;
        }

        for (int i=0; i<30; i++){
            if (check[i] == 0){
                bw.write(String.valueOf(i+1));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();

    }
}
