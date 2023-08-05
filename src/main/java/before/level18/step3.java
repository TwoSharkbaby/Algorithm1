package before.level18;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashSet<String> dancers = new HashSet<>();
        boolean start = false;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            String dancerA = st.nextToken();
            String dancerB = st.nextToken();
            if (start) {
                if (dancers.contains(dancerA)||dancers.contains(dancerB)){
                    dancers.add(dancerA);
                    dancers.add(dancerB);
                }
            }
            if (dancerA.equals("ChongChong")||dancerB.equals("ChongChong")) {
                dancers.add(dancerA);
                dancers.add(dancerB);
                start = true;
            }
        }

        bw.write(String.valueOf(dancers.size()));
        bw.flush();
        bw.close();
        bf.close();
    }
}
