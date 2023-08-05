package before.level5;

import java.io.*;

public class step11 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String word = bf.readLine();
            if (word == null || word.isEmpty()){
                break;
            }
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
