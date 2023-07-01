package level10;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int num3 = Integer.parseInt(st.nextToken());
            if (num1 == 0 && num2 == 0 && num3 == 0) {
                break;
            }
            if (num1 == num2 && num1 == num3) {
                bw.write("Equilateral");
            } else if ((num1 >= (num2 + num3)) || (num2 >= (num1 + num3)) || (num3 >= (num1 + num2))) {
                bw.write("Invalid");
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
