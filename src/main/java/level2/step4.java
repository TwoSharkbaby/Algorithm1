package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if ( a > 0 && b > 0) {
            System.out.println("1");
        } else if ( a < 0 && b > 0 ) {
            System.out.println("2");
        } else if ( a < 0 && b < 0 ) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

    }
}
