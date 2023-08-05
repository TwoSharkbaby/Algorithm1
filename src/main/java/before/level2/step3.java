package before.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());

        if ( a % 4 == 0 && (( a % 100 != 0 ) || ( a % 400 == 0))) {
            System.out.println("1");
        }  else {
            System.out.println("0");
        }

    }
}
