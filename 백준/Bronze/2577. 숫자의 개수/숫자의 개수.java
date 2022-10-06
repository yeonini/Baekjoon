import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 숫자 받고 곱하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int ABC = A * B * C;
        
        //0부터 9까지 들어갈 배열 선언(기본값 0)
        int[] num = new int[10];
        //반복문 실행하기 위해서 ABC의 길이 선언
        int ABCLen = String.valueOf(ABC).length();

        // ABC숫자 한 숫자씩 돌면서 해당하는 숫자에 +1 해주기
        for (int i = 0; i < ABCLen; i++) {
            int idx = String.valueOf(ABC).charAt(i) - '0';
            num[idx]++;
        }
        
        // 배열 순회하면서 프린트
        for (int n : num){
            System.out.println(n);
        }
    }
}
