import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        /* 배열에 값 넣기 */
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        /* 오름차순 정렬 */
        Arrays.sort(arr);
        
        /* 빌더로 한 줄 씩 출력문 작성 */
        StringBuilder sb = new StringBuilder("");
        for(int num : arr){
            sb.append(num).append("\n");
        }
        
        System.out.println(sb);
    }
}