package before.level7;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int[][] page = new int[100][100];
        int total = 0;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j=x; j < x+10; j++){
                for (int k=y; k < y+10; k++){
                    page[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < page.length; i++){
            for (int j = 0; j < page[i].length; j++){
                if (page[i][j]==1){
                    total++;
                }
            }
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        bf.close();
    }
}
