package before.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int price;

        if ( a == b && b == c && c == a){
            price = 10000 + a*1000;
        } else if ( a == b ) {
            price = 1000 + a*100;
        } else if ( b == c ) {
            price = 1000 + b*100;
        } else if ( c == a ) {
            price = 1000 + c*100;
        } else {
            if ( a >= b && a >= c ){
                price = a*100;
            } else if ( b >= a && b >= c){
                price = b*100;
            } else {
                price = c*100;
            }
        }

        System.out.println(price);

    }
}
