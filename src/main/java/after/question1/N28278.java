package after.question1;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N28278 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            int commend = Integer.parseInt(st.nextToken());
            if (commend==1) {
                int num = Integer.parseInt(st.nextToken());
                compute1(commend, num);
            } else {
                bw.write(String.valueOf(compute2(commend)));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        bf.close();
    }

    static int compute2(int commend) {
        if (commend==5) {
            return arr.size() == 0 ? -1 : arr.get(arr.size() - 1);
        } else if (commend==3) {
            return arr.size();
        } else if (commend==4) {
            return arr.size() == 0 ? 1 : 0;
        } else {
            int num = arr.size() == 0 ? -1 : arr.get(arr.size() - 1);
            if (num != -1) {
                arr.remove(arr.size() - 1);
            }
            return num;
        }
    }

    static void compute1(int commend, int num) {
        arr.add(num);
    }
}
