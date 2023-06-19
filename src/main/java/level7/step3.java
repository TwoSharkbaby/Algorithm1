package level7;

import java.io.*;
import java.util.StringTokenizer;

public class step3 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] words = new char[5][15];
        int max = 0;

        for (int i = 0; i < words.length; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String word = st.nextToken();
            if(max<word.length()){
                max = word.length();
            }
            for (int j = 0; j < word.length(); j++){
                words[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < max; i++){
            for (int j = 0; j < words.length; j++){
                if (words[j][i] != '\0'){
                    bw.write(words[j][i]);
                }
            }
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
