import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼, 토크나이저로 각 자리 숫자 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //각 자리 숫자 제곱해서 더해주기
        int sum = 0;
        int num = 0;

        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }

        //나머지 연산자로 나머지구해서 출력
        System.out.println(sum % 10);
    }
}