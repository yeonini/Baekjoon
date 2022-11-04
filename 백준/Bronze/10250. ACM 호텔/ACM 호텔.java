import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* T(테스트케이스 수) 받아오기 */
        int T = Integer.parseInt(br.readLine());

        while(T > 0){
            T--;
            /* 토크나이저로 H(전체 층수), W(전체 호수), N(손님) 받아오기 */
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            
            /* 손님에게 배정될 층수(h), 호수(w) */
            int h = 0;
            int w = 0;
            
            /* 방 번호 구하기 */
            /* 꼭대기 층(전체 층(H)이 손님 수(N)의 약수) */
            if (N % H == 0) {
                h = H * 100;
                w = N / H;
            }
           
            else {
                h = (N % H) * 100;
                w = N / H + 1;
            }
            System.out.println(h + w);
        }
    }
}
/* ex. 3층(H), 4호(W)짜리 건물에 3번째(N) 손님, 4번째(N) 손님 
□ □ □ □     □ □ □ □     3 □ □ □     ■ □ □ □
□ □ □ □     2 □ □ □     ■ □ □ □     ■ □ □ □
1 □ □ □     ■ □ □ □     ■ □ □ □     ■ 4 □ □
101호       201호      301호(3/3=1) 102호(4/3+1=2)
 */