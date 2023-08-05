package before.level19;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class step1 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String commend = st.nextToken();
            if (commend.equals("push")) {
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

    static int compute2(String commend) {
        if (commend.equals("top")) {
            return arr.size() == 0 ? -1 : arr.get(arr.size() - 1);
        } else if (commend.equals("size")) {
            return arr.size();
        } else if (commend.equals("empty")) {
            return arr.size() == 0 ? 1 : 0;
        } else {
            int num = arr.size() == 0 ? -1 : arr.get(arr.size() - 1);
            if (num != -1) {
                arr.remove(arr.size() - 1);
            }
            return num;
        }
    }

    static void compute1(String commend, int num) {
        arr.add(num);
    }
}
