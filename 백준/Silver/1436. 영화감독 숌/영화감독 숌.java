import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // N 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1; // N번째 수 확인용 count
        int number = 666; // 1번째 수인 666부터 하나씩 더할 예정\

        // count가 N보다 작을 때 반복
        while(count < N){
            // 숫자 하나씩 더하기
            number++;
            // 문자열에 666들어 있으면 count 더하기
            if ((String.valueOf(number)).contains("666")) {
                count++;
            }
        }
        System.out.println(number);
    }
}