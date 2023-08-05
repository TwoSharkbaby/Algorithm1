package before.level6;

import java.io.*;
import java.util.StringTokenizer;

public class step5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        word = word.toUpperCase();
        int[] num = new int[26];
        int max = 0;
        char result = '?';

        for (int i=0; i<word.length(); i++){
            num[word.charAt(i)-'A']++;
        }

        for (int i=0; i<num.length; i++){
            if(max < num[i]){
                max = num[i];
                result = (char)(i+'A');
            } else if (max == num[i]){
                result = '?';
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
        bf.close();

    }
}
