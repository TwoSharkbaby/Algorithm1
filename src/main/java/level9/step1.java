package level9;

import java.io.*;
import java.util.StringTokenizer;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if (num1==0 && num2==0){
                break;
            }
            if (num2%num1==0){
                bw.write("factor");
            } else if (num1%num2==0){
                bw.write("multiple");
            } else {
                bw.write("neither");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
