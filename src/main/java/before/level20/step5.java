package before.level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class step5 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();

        while (n-- > 0) {
            st = new StringTokenizer(bf.readLine());
            int num;
            switch (st.nextToken()) {
                case "push_front":
                    arr.add(0, Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    arr.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    num = arr.isEmpty() ? -1 : arr.get(0);
                    if (num != -1){
                        arr.remove(0);
                    }
                    sb.append(num).append('\n');
                    break;
                case "pop_back":
                    num = arr.isEmpty() ? -1 : arr.get(arr.size()-1);
                    if (num != -1){
                        arr.remove(arr.size()-1);
                    }
                    sb.append(num).append('\n');
                    break;
                case "size":
                    sb.append(arr.size()).append('\n');
                    break;
                case "empty":
                    num = arr.isEmpty() ? 1 : 0;
                    sb.append(num).append('\n');
                    break;
                case "front":
                    num = arr.isEmpty() ? -1 : arr.get(0);
                    sb.append(num).append('\n');
                    break;
                case "back":
                    num = arr.isEmpty() ? -1 : arr.get(arr.size()-1);
                    sb.append(num).append('\n');
                    break;
            }
        }

        System.out.println(sb);
        bf.close();
    }
}
