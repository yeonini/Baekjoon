import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // T 받아오기
        int T = Integer.parseInt(br.readLine());

        // T만큼 만큼
        while(T > 0){
            // H, W, N 받아오기
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int h = 0; //층 수
            int w = 0; //호 수

            if (N % H == 0) {
                h = H * 100;
                w = N / H;
            }
            else {
                h = (N % H) * 100;
                w = N / H + 1;
            }
            System.out.println(h + w); //결과 출력
            T--;
        }
    }
}
