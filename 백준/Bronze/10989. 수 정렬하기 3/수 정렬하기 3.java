import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 첫째 줄 N 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //N번 반복하면서 리스트 추가
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        //오름차순 정렬
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder("");

        //하나씩 출력
        for(int num : numbers){
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
