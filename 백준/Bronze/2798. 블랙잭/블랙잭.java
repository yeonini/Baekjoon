import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N, M
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 카드 숫자 담을 배열
        int[] arr = new int[N];

        // 배열에 카드 숫자 담기
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;
        // 반복문으로 조합구해서 합계 구하기
        // 합계가 maxSum보다 크고, M 이하이면 maxSum에 넣어주기
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if (maxSum < sum && sum <= M) {maxSum = sum;}
                }
            }
        }
        System.out.println(maxSum);
    }
}
