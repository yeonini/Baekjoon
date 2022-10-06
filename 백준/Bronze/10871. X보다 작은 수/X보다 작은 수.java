import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        //결과 문자열 선언
        String result = "";

        //토크나이저로 수열 받아서 N만큼 반복 순회
        StringTokenizer stArr = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++){
            //수열 요소 받고, X보다 작은지 확인해서 String.format으로 띄어쓰기
            int num = Integer.parseInt(stArr.nextToken());
            if (num < X) {
               result = String.format("%s %d", result, num);
            }
        }
        // 맨 앞 공백 제거
        System.out.println(result.strip());
    }
}
