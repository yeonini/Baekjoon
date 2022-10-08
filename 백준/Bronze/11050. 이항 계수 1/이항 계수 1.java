import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼와 토크나이저로 N과 M 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //메소드 이용해서 이항계수 값 구해주기
        //이항계수의 값은 nCm 조합 공식으로 구할 수 있다.
        //n!/(n-k)!*k!
        System.out.println(factorial(n)/(factorial(n-k)*factorial(k)));

    }
    // 팩토리얼 메소드 선언 factorial
    static int factorial(int N){
        if (N <= 1) {return 1;}

        return N * factorial(N-1);
    }
}
