package before.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if ( a != 0 && b >= 45 ) {
            System.out.println( a + " " + ( b - 45 ) );
        } else if ( a != 0 && b < 45 ) {
            System.out.println( ( a - 1 ) + " " + (b - 45 + 60));
        } else if ( a == 0 && b >= 45 ) {
            System.out.println( a + " " + ( b - 45 ) );
        } else {
            System.out.println( ( a + 23 ) + " " + (b - 45 + 60));
        }

    }
}
