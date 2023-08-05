package before.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int c = Integer.parseInt(st.nextToken());

        int hour, minute;

        hour = c / 60;
        minute = c % 60;

        minute = minute + b;
        hour = hour + a;

        if ( minute >= 60 ){
            hour++;
            minute = minute -60;
        }
        if ( hour >= 24 ){
            hour = hour - 24;
        }

        System.out.println(hour+ " " + minute);
    }
}
