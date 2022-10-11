// 2164 카드2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 숫자 N 받아서 N개의 값 큐에 저장 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++){
            queue.offer(i);
        }

        /* 앞 숫자 빼고, 다시 앞숫자 빼서 뒤에 더해주기 */
        /* queue 길이 1이면 멈추고 객체 반환 */
        while(queue.size() != 1){
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }
}