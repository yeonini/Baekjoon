// 1920 수 찾기
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* numN 배열은 이진탐색 예정이므로 stream 이용하여 정렬해준다.*/
        int N = Integer.parseInt(br.readLine());
        String[] numN = Arrays.stream(br.readLine().split(" "))
                .distinct()
                .sorted()
                .toArray(String[]::new);

        int M = Integer.parseInt(br.readLine());
        String[] numM = br.readLine().split(" ");

        br.close();

        StringBuilder sb = new StringBuilder("");

        /* numN 배열 이진탐색하며, numM[i]가 있는지 확인 */
        /* Arrays.binarySearch 써서 있으면 0이상(인덱스), 없으면 음수값 나온다 */
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