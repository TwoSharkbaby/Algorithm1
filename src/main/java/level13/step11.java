package level13;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class step11 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        Long[] arr = new Long[num];
        Set<Long> hash = new HashSet<>();
        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < num; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            hash.add(arr[i]);
        }

        Long[] result = hash.toArray(new Long[0]);
        Arrays.sort(result);

        for (int i = 0; i < arr.length; i++) {
            int value = Arrays.binarySearch(result, arr[i]);
            bw.write(String.valueOf(value) + " ");
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
