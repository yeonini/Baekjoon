import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // N명
        int K = Integer.parseInt(st.nextToken()); // K번째
        
        br.close();

        /* 1 ~ N 리스트 생성 */
        ArrayList<Integer> list = new ArrayList<>(N);
        for (int i = 1; i <= N; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder("<");

        /* 인덱스 K씩 증가하면서 삭제 */
        /* idx += K-1 에서 K-1인 이유
        1. list가 0이 아닌 1부터 N까지여서
        2. 앞선 순서에서 하나 삭제했기 때문에 인덱스 번호 맞추려고 1개 빼고 더한 것
         */
        int idx = 0;
        while (list.size() != 0){
            idx += K-1;

            /* 리스트 사이즈 넘으면 나머지값으로 바꿔주기 */
            if (idx > list.size()-1){
                idx %= list.size();
            }

            /* 빌더에 넣어주고 리스트에서 숫자 삭제 */
            sb.append(list.get(idx)).append(", ");
            list.remove(idx);
        }

        sb.setLength(sb.length() - 2); //마지막 ", " 지우기

        sb.append(">");
        System.out.println(sb);
    }
}