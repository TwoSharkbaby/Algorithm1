package level8;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        char[] words = word.toCharArray();
        int num = Integer.parseInt(st.nextToken());
        int result = 0;
        char[] sys = {'1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < words.length; i++) {
            int position = 1;
            for (int j = 0; j < words.length - i - 1; j++) {
                position = position * num;
            }
            for (int j = 0; j < sys.length; j++) {
                if (words[i] == sys[j]) {
                    result = result + position * (j + 1);
                    break;
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();
    }
}
