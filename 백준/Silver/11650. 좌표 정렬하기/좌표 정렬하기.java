import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 점 갯수 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //인트 배열 생성 후, 차례로 받아오기
        int[][] dots = new int[N][2];
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            dots[i][0] = Integer.parseInt(st.nextToken()); // x값
            dots[i][1] = Integer.parseInt(st.nextToken()); // y값
        }

        //x 오름차순 > y 오름차순으로 정렬
        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        // StringBuilder로 출력
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N; i++){
            sb.append(dots[i][0]).append(" ").append(dots[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}