package level10;

import java.io.*;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int num2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int num3 = Integer.parseInt(st.nextToken());

        if (num1 == 60 && num2 == 60 && num3 == 60) {
            bw.write("Equilateral");
        } else if ((num1 + num2 + num3) == 180) {
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        } else {
            bw.write("Error");
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
