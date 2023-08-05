package before.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int total = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int tmp = 0;

        for (int i=1; i <= count; i++) {
            st = new StringTokenizer(bf.readLine());
            int productPrice = Integer.parseInt(st.nextToken());
            int productCount = Integer.parseInt(st.nextToken());
            tmp = tmp + productPrice * productCount;
        }

        String result = (total == tmp) ? "Yes" : "No";
        System.out.println(result);

    }
}
