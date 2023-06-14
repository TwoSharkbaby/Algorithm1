package level6;

import java.io.*;
import java.util.StringTokenizer;

public class step9 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] b = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double totalPoint = 0.0;
        double total = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String word = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            } else {
                totalPoint += point;
                for (int j = 0; j < a.length; j++) {
                    if (grade.equals(a[j])) {
                        total = total + point * b[j];
                    }
                }
            }
        }

        bw.write(String.valueOf(total / totalPoint));
        bw.flush();
        bw.close();
        bf.close();
    }
}
