package level11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf("1"));
        bw.newLine();
        bw.write(String.valueOf("0"));
        bw.flush();
        bw.close();

    }
}
