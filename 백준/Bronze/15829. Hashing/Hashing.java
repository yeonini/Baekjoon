import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // L, str 받아오기
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();


        // 반복문으로 str 한 글자씩 숫자로 변환하고
        // 모듈러연산 성질 이용해서 overflow되지 않도록 연산해준다.
        // ( A + B ) mod M = ((A mod M) + (B mod M)) mod M
        // ( A * B ) mod M = ((A mod M) * (B mod M)) mod M
        int M = 1234567891;
        long sum = 0;
        long B = 1; // 31^0 = 1

        for (int i = 0; i < L; i++){
            sum += ((str.charAt(i) - 'a' + 1)*B)% M;

            B = (B * 31) % M; // Math.pow 사용 시, 큰 숫자에서 overflow발생 ㅠ
        }
        System.out.println(sum % M);
    }
}
