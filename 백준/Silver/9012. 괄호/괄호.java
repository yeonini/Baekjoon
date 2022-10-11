//9012 괄호
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 숫자 N 받아서 N번 반복문 만들기 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < N; i++) {
            /* 스택 만들고, '('이면 문자 넣고, ')'이면 문자 빼는 방식으로 진행 예정 */
            Stack<Character> st = new Stack<>();

            /* 문자열 받아서 문자 순회 */
            String str = br.readLine();
            String result = "YES";
            for (int j = 0; j < str.length(); j++) {
                /* '('이면 스택에 1 넣고, ')'이면 빼기, 빼기전에 스택 비어있으면 NO */
                if (str.charAt(j) == '(') {
                    st.push('(');
                } else if (st.empty()) {
                    result = "NO";
                    break;
                } else {
                    st.pop();
                }
            }
            
            /* 마지막에 스택 비어있지 않으면(=남은 1 있으면) NO */
            if (!st.empty()) {
                result = "NO";
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}