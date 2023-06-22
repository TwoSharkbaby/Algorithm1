package level8;

import java.io.*;
import java.util.StringTokenizer;

public class step6 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int count = 0;
        int x = 0;
        int y = 0;

        int i = 1;
        while (count < num) {
            count = count + i;
            i++;
        }

        if ((i - 1) % 2 == 0) {
            y = 1 + (count - num);
            x = (i - 1) - (count - num);
        } else {
            y = (i - 1) - (count - num);
            x = 1 + (count - num);
        }

        bw.write(x + "/" + y);

        bw.flush();
        bw.close();
        bf.close();
    }
}
