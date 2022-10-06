import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 숫자 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N만큼 반복
        for (int i = 1; i <= N; i++){
            //stringbuilder로 빈 문자열 선언
            StringBuilder str = new StringBuilder("");

            //자리 i개 남기고(*들어갈 자리) 공백 추가
            for (int j = 0; j < N-i; j++){
                str.append(" ");
            }

            //남은 자리에 *추가
            for (int k = N-i; k < N; k++){
                str.append("*");
            }

            System.out.println(str);
        }
    }
}
