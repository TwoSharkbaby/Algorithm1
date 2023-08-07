package after.question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4779 {

    static char[] result;

    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st;

        while ((st = bf.readLine()) != null) {
            int n = Integer.parseInt(st);
            int count = (int) Math.pow(3, n);
            result = new char[count];
            for (int i = 0; i < count; i++) {
                result[i] = '-';
            }

            compute(0, count);

            for (int i = 0; i < count; i++) {
                sb.append(result[i]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
        bf.close();
    }

    static void compute(int startNum, int count) {
        if (count < 3) {
            return;
        }
        for (int i = startNum + count / 3; i < startNum + count / 3 * 2; i++) {
            result[i] = ' ';
        }
        compute(startNum, count / 3);
        compute(startNum + count / 3 * 2, count / 3);
    }
}
