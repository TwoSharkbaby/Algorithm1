package before.level14;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> mapA = new HashMap<>();
        int[] arrA = new int[a];
        HashMap<Integer, Integer> mapB = new HashMap<>();
        int[] arrB = new int[b];
        int count = 0;

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < a; i++) {
            int num = Integer.parseInt(st.nextToken());
            mapA.put(num, 0);
            arrA[i] = num;
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < b; i++) {
            int num = Integer.parseInt(st.nextToken());
            mapB.put(num, 0);
            arrB[i] = num;
        }

        for (int i = 0; i < b; i++) {
            if (!mapA.containsKey(arrB[i])) {
                count++;
            }
        }

        for (int i = 0; i < a; i++) {
            if (!mapB.containsKey(arrA[i])) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        bf.close();

    }
}
