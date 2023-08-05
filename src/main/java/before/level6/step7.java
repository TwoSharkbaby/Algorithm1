package before.level6;

import java.io.*;
import java.util.StringTokenizer;

public class step7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        int count = word.length();

        for (int i = 0; i < word.length(); i++) {

            char wordChar = word.charAt(i);

            if (wordChar == 'c') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-') {
                        i++;
                        count--;
                    }
                }
            } else if (wordChar == 's' || wordChar == 'z') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == '=') {
                        i++;
                        count--;
                    }
                }
            } else if (wordChar == 'l' || wordChar == 'n') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == 'j') {
                        i++;
                        count--;
                    }
                }
            } else if (wordChar == 'd') {
                if (i < word.length() - 1) {
                    if (word.charAt(i + 1) == 'z') {
                        if (i < word.length() - 2) {
                            if (word.charAt(i + 2) == '=') {
                                i += 2;
                                count -= 2;
                            }
                        }
                    } else if (word.charAt(i + 1) == '-') {
                        i++;
                        count--;
                    }
                }
            }

        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        bf.close();

    }
}
