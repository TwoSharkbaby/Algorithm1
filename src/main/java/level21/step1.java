package level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        long n = Integer.parseInt(st.nextToken());

        System.out.println(compute(n));
        bf.close();
    }

    private static long compute(long n) {
        if (n <= 0){
            return 1;
        } else {
            return n * compute(n-1);
        }
    }
}
