package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int total = 0;

        for (int i=1; i <= count; i++) {
            total += i;
        }

        System.out.println(total);

    }
}
