import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //이중배열 이용해서 풀 예정
        //버퍼로 t(테스트 수), k(층 수), n(호 수) 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        //테스트 횟수만큼 반복
        while (t > 0) {
            int k = Integer.parseInt(br.readLine()); // 층
            int n = Integer.parseInt(br.readLine()); // 호

            //층, 호로 이루어진 이중배열 생성
            //0층도 있어서 k+1로 해야 한다.
            int[][] apt = new int[k+1][n];

            for (int i = 0; i < k+1; i++){
                for (int j = 0; j < n; j++){
                    // 0층인 경우, 인원 수 = 호 수
                    if (i == 0){
                        apt[i][j] = j+1;
                    }

                    // 1호인 경우, 인원 수 = 아랫집 인원 수
                    else if (j == 0){
                        apt[i][j] = apt[i-1][j];
                    }

                    // 그 외의 경우, 인원 수 = 앞집 + 아랫집 인원 수
                    else {
                        apt[i][j] = apt[i][j-1] + apt[i-1][j];
                    }
                }
            }
            //k층 n호의 인원수 출력
            System.out.println(apt[k][n-1]);

            t--;
        }
    }
}
