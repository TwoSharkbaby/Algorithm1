package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int [] num = new int [count];
        st = new StringTokenizer(bf.readLine());

        for (int i=0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        int val = Integer.parseInt(st.nextToken());
        int total = 0;

        for (int i=0; i < num.length; i++){
            if (val == num[i]){
                total++;
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();

    }
}
