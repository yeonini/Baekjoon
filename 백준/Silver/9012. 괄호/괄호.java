//9012 괄호
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Stack<Character> st = new Stack<>();

            String result = "YES";

            /* 문자열 받아서 문자 순회 */
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                /* if : '('이면 스택에 넣기 
                 * else if : '(' 먼저 들어가있지 않으면 바로 NO로 끝내주기
                 * else : '(' 아닌 경우 ')'니까 pop 으로 빼주기*/
                if (str.charAt(j) == '(') {
                    st.push('(');
                }else if (st.empty()) {
                    result = "NO";
                    break;
                }else {
                    st.pop();
                }
            }

            /* 마지막에 스택 비어있지 않으면(=남은 문자 있으면) NO */
            if (!st.empty()) {
                result = "NO";
            }

            sb.append(result).append("\n");
        }
        br.close();

        System.out.println(sb);
    }
}