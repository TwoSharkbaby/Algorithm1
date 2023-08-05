package before.level19;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class step4 {

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String words = bf.readLine();
            if (words.equals(".")) {
                break;
            }
            bw.write(compute(words));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        bf.close();
    }

    static String compute(String words) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }

}
