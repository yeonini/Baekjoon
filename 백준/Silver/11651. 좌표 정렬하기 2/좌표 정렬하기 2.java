import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder("");
        int N = Integer.parseInt(br.readLine());

        int[][] dots = new int[N][2];

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            dots[i][1] = Integer.parseInt(st.nextToken()); // X좌표
            dots[i][0] = Integer.parseInt(st.nextToken()); // Y좌표
        }

        br.close();

        /* Y 오름차순 > X 오름차순으로 정렬 */
        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        /* StringBuilder로 형식 맞춰서 출력 */
        for (int i = 0; i < N; i++){
            sb.append(dots[i][1]).append(" ").append(dots[i][0]).append('\n');
        }

        System.out.println(sb);
    }
}