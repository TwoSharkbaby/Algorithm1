package level20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class step6 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> deque = new LinkedList<>();
        int[] arr = new int [m];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++){
            int targetIndex = deque.indexOf(arr[i]);
            int halfIndex;
            if (deque.size() % 2 == 0){
                halfIndex = deque.size() / 2 - 1;
            } else {
                halfIndex = deque.size() / 2;
            }
            if (targetIndex <= halfIndex){
                for (int j = 0; j < targetIndex; j++){
                    int tem = deque.pollFirst();
                    deque.offerLast(tem);
                    count++;
                }
            } else {
                for (int j = 0; j < deque.size() - targetIndex; j++){
                    int tem = deque.pollLast();
                    deque.offerFirst((tem));
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
        bf.close();
    }
}
