package level5;

import java.io.*;
import java.util.StringTokenizer;

public class step6 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String word = st.nextToken();
        char[] chars = word.toCharArray();
        int[] letters = new int[26];

        for (int i=0; i<letters.length; i++){
            letters[i] = -1;
        }

        for (int i=0; i<chars.length; i++){
            if (letters[chars[i]-97] == -1){
                letters[chars[i]-97] = i;
            }
        }

        for(int k = 0; k < letters.length; k++) {
            bw.write(letters[k] + " ");
        }

        bw.flush();
        bw.close();

    }
}
