package level13;

import java.io.*;
import java.util.*;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Long num = Long.parseLong(st.nextToken());
        String stringNum = String.valueOf(num);
        char[] arr = stringNum.toCharArray();
        Arrays.sort(arr);
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i));
        }

        bw.flush();
        bw.close();
        bf.close();

    }
}
