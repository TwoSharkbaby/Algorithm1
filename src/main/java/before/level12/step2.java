package before.level12;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int result = 0;

        for (int i = 0; i < num; i++){
            int temNum = i;
            int sum = 0;

            while (temNum != 0){
                sum += temNum % 10;
                temNum /= 10;
            }

            if (num==(sum+i)){
                result = i;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }
}
