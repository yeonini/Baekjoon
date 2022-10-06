import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 문자열 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        // 아스키코드로 a 첫 등장 인덱스 넣어두기(공란으로 두면 맨 앞에 공백 생겨서..)
        String result = String.valueOf(S.indexOf(97));

        // 아스키코드로 b부터 z까지 숫자로 순회 (97~122)
        for(int i = 98; i <= 122; i++){
            // S.indexOf(아스키코드)로 첫 등장 인덱스 받아오기
            int idx = S.indexOf(i);
            // String.format으로 띄어쓰기되게 만들어주기
            result = String.format("%s %d", result, idx);
        }

        System.out.println(result);
    }
}