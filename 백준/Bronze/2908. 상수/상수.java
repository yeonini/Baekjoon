import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼와 토크나이저로 숫자 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        //A와 B 뒤집기
        int revA = reverse(A);
        int revB = reverse(B);

        //revA와 revB 비교해서 큰 수 출력
        if (revA > revB) {
            System.out.println(revA);
        }
        else {
            System.out.println(revB);
        }
    }
    static int reverse(int N){
        StringBuilder sb = new StringBuilder("");
        while(N > 0){
            int n = N % 10;
            N /= 10;

            sb.append(String.valueOf(n));
        }
        return Integer.parseInt(sb.toString());
    }
}
