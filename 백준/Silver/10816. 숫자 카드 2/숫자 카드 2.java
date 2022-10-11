// 10816 숫자 카드 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 입력값 받아오기. N개, M개의 수를 배열로 가져온다. */
        /* int N과 M은 사용하지 않음 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] numN = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] numM = br.readLine().split(" ");

        /* StringBuilder 사용해서 출력 예정 */
        StringBuilder sb = new StringBuilder("");

        /* HashMap 이용하여 key:value = 수:갯수로 저장 */
        /* HashMap 첫 저장값은 1, 키가 이미 맵에 있으면 +1 해서 값 덮어준다 */
        HashMap<String, Integer> hm = new HashMap<>();
        for (String n: numN){
            if(!hm.containsKey(n)) {
                hm.put(n, 1);
            }
            else {
                hm.put(n, hm.get(n)+1);
            }
        }

        /* numM[i]값이 해시맵에 있으면 값, 없으면 0 넣기 */
        /* 있으면(0 이상) 1, 없으면(음수) 0 */
        for (int i = 0; i < numM.length; i++) {
            if(hm.containsKey(numM[i])) {
                sb.append(hm.get(numM[i])).append(" ");
            }
            else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb);
    }
}