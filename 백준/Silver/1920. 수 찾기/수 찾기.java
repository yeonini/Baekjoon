import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1920번 수 찾기
public class Main {
    public static void main(String[] args) throws IOException {
        /* 입력값 받아오기. N개, M개의 수를 배열로 가져온다. */
        /* int N과 M은 사용하지 않음 */
        /* numN 배열은 이진탐색 예정이므로 stream 이용하여 정렬해준다.*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] numN = Arrays.stream(br.readLine().split(" "))
                .distinct()
                .sorted()
                .toArray(String[]::new);

        int M = Integer.parseInt(br.readLine());
        String[] numM = br.readLine().split(" ");

        /* StringBuilder 사용해서 출력 예정 */
        StringBuilder sb = new StringBuilder("");

        /* numN 배열 이진탐색하며, numM[i]가 있는지 확인 */
        /* 있으면(0 이상) 1, 없으면(음수) 0 */
        for (int i = 0; i < numM.length; i++) {
            int result = Arrays.binarySearch(numN, numM[i]);
            if(result >= 0) {
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}