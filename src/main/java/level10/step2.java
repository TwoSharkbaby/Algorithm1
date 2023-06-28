package level10;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[] arr = {w - x, h - y, x - 0, y - 0};
        int result = 1000;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<result){
                result = arr[i];
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }
}
