import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼, num으로 숫자 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 0부터 num까지 i 순회
        for (int i = 0; i < num; i++){
            // sum = i 넣어주기
            int sum = i;

            // 각 자리수 sum에 더해주기 (나누기와 나머지 이용)
            int N = i;
            while(N != 0){
                sum += N % 10;
                N = N/10;
            }

            // sum == num 같으면 i 출력하고 반복문 break
            if (sum == num) {
                System.out.println(i);
                break;
            }

            // 생성자가 없는 경우 0 출력
            else if (i == num-1) {
                System.out.println(0);
            }
        }
    }
}