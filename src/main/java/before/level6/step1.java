package before.level6;

import java.io.*;

public class step1 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("         ,r'\"7");
        bw.newLine();
        bw.write("r`-_   ,'  ,/");
        bw.newLine();
        bw.write(" \\. \". L_r'");
        bw.newLine();
        bw.write("   `~\\/");
        bw.newLine();
        bw.write("      |");
        bw.newLine();
        bw.write("      |");
        bw.newLine();

        bw.flush();
        bw.close();

    }
}
