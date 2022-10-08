import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[N]; // 오름차순 정렬될 배열 선언

        for (int i = 0; i < N; i++){    //배열에 값 넣기
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr); // 오름차순 정렬

        StringBuilder sb = new StringBuilder("");

        for(int num : arr){
            sb.append(num).append("\n"); //StringBuilder 로 출력문 작성
        }
        System.out.println(sb); // 출력
    }
}