package level4;

import java.io.*;
import java.util.StringTokenizer;

public class step10 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        double[] num = new double[Integer.parseInt(st.nextToken())];
        st = new StringTokenizer(bf.readLine());
        double max = 0;
        double total = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Double.parseDouble(st.nextToken());
            if (max < num[i]){
                max = num[i];
            }
        }

        for (int i = 0; i < num.length; i++){
            num[i] = num[i]/max*100;
            total += num[i];
        }


        bw.write(String.valueOf(total/num.length));

        bw.flush();
        bw.close();

    }
}
