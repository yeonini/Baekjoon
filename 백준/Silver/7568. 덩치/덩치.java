import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 사람 수 N 받기
        int N = Integer.parseInt(br.readLine());

        // 몸무게, 키 받아서 배열에 저장하기
        int[][] info = new int[N][2];
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            info[i][0] = Integer.parseInt(st.nextToken());
            info[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder("");

        // 덩치 비교, i번째 사람과 j번째 사람 비교
        for (int i = 0; i < N; i++){
            int rank = 1; // 등수 나타낼 변수

            for (int j = 0 ; j < N; j++){
                if (i == j) {continue;} //같은 사람인경우 비교하지 않음.

                // 사람j의 덩치가 더 큰 경우(몸무게도 무겁고, 키도 큰 경우)
                else if (info[i][0] < info[j][0] && info[i][1] < info[j][1]){
                    rank++; // j의 덩치가 더 크면 i의 rank가 1씩 뒤로 밀려난다.
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}