import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 숫자 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        // N부터 1까지 차례대로 출력
        for (int i = N; i > 0; i--){
            System.out.println(i);
        }
    }
}
