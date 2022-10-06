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

        //append 쓸거여서 StringBuilder로 result 선언
        StringBuilder result = new StringBuilder("");

        //토크나이저로 수열 받아서 N만큼 반복 순회
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++){
            //수열 요소 받고, X보다 작은지 확인해서 append로 문자열 뒤에 추가
            int num = Integer.parseInt(st.nextToken());

            if (num < X) {
               result.append(num).append(' ');
            }
        }
        System.out.println(result);
    }
}