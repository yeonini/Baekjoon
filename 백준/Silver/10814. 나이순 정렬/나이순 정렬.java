import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 회원수 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //문자열 배열 생성 후, 차례로 받아오기
        String[][] info = new String[N][2];
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            info[i][0] = st.nextToken();
            info[i][1] = st.nextToken();
        }

        //나이순으로 정렬해주기 (같을 때 가입순으로 정렬되는 건 자동으로 완료 된다)
        Arrays.sort(info, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        // StringBuilder로 출력
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < N; i++){
            sb.append(info[i][0]).append(" ").append(info[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}