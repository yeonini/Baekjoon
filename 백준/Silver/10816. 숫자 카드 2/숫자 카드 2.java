// 10816 숫자 카드 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");

        int N = Integer.parseInt(br.readLine());
        String[] numN = br.readLine().split(" ");

        int M = Integer.parseInt(br.readLine());
        String[] numM = br.readLine().split(" ");

        br.close();

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