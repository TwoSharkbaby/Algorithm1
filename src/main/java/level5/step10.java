package level5;

import java.io.*;
import java.util.StringTokenizer;

public class step10 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        char[] chars = word.toCharArray();
        int total = chars.length;

        for (int i=0; i<chars.length; i++){
            if (chars[i] == 'A' || chars[i] == 'B' || chars[i] == 'C'){
                total += 2;
            } else if (chars[i] == 'D' || chars[i] == 'E' || chars[i] == 'F'){
                total += 3;
            } else if (chars[i] == 'G' || chars[i] == 'H' || chars[i] == 'I'){
                total += 4;
            } else if (chars[i] == 'J' || chars[i] == 'K' || chars[i] == 'L'){
                total += 5;
            } else if (chars[i] == 'M' || chars[i] == 'N' || chars[i] == 'O'){
                total += 6;
            } else if (chars[i] == 'P' || chars[i] == 'Q' || chars[i] == 'R' || chars[i] == 'S'){
                total += 7;
            } else if (chars[i] == 'T' || chars[i] == 'U' || chars[i] == 'V'){
                total += 8;
            } else if (chars[i] == 'W' || chars[i] == 'X' || chars[i] == 'Y' || chars[i] == 'Z'){
                total += 9;
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();

    }
}
