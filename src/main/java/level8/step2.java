package level8;

import java.io.*;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int total = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        char[] sys = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
                'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int position = 1;
        int temp = total;
        while (temp>=num){
            temp = temp/num;
            position++;
        }

        char[] result = new char[position];

        for (int i=0; i <result.length; i++){
            result[i] = sys[total%num];
            total = total/num;
        }

        for (int i=result.length-1; i >= 0; i--){
            bw.write(String.valueOf(result[i]));
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
