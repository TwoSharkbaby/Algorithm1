package level6;

import java.io.*;
import java.util.StringTokenizer;

public class step4 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        char[] wordChar = word.toCharArray();
        char[] reverseChar = new char[wordChar.length];
        int t = 0;
        int result = 1;

        for (int i=wordChar.length; i > 0; i--){
            reverseChar[i-1] = wordChar[t];
            t++;
        }

        for (int i=0; i < wordChar.length; i++){
            if (wordChar[i] != reverseChar[i]){
                result = 0;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        bf.close();

    }
}
