import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //각 숫자 받아서 x, y, w, h 선언
        //버퍼와 토크나이저 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        //x, w-x, y, h-y 중에서 최소 구하기
        //배열로 만들고, 오름차순 정렬해서 첫 요소 출력
        int[] dist = {x, w-x, y, h-y};
        Arrays.sort(dist);
        System.out.println(dist[0]);
    }
}