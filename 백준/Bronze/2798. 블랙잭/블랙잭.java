import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* N(오픈된 카드 수), M(딜러 숫자) 값 넣기 */
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        /* 배열에 오픈된 카드들의 숫자 담기 */
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /* M을 넘지 않는 최대 합계 maxSum 구하기 (조합 이용) */
        int maxSum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            for(int j = i+1; j < arr.length; j++){
                
                for(int k = j+1; k < arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    
                    if (maxSum < sum && sum <= M) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);
    }
}