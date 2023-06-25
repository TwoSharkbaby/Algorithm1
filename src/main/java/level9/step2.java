package level9;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class step2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= num1; i++){
            if (num1%i==0){
                result.add(i);
            }
        }

        if (result.size()<num2){
            bw.write("0");
        } else {
            bw.write(String.valueOf(result.get(num2-1)));
        }

        bw.flush();
        bw.close();
        bf.close();
    }
}
