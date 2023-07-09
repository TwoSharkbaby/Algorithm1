package level13;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] people = new int[Integer.parseInt(st.nextToken())];
        int prize = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < people.length; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(people);

        int minPointPrize = people[people.length - prize];

        bw.write(String.valueOf(minPointPrize));
        bw.flush();
        bw.close();
        bf.close();

    }
}
