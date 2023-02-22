import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();
		boolean result; // 괄호 틀리면 false

		while (true) {
			/* 한 줄씩 불러와서 진행하고, "."인 경우에는 while문 종료 */
			String s = br.readLine();
			if (s.equals(".")) {
				break;
			}

			result = true;

            /* 한 글자씩 순회하면서 괄호 맞는지 체크
            '(', '[' 들어오면 stack에 추가
            ')', ']' 들어오면 stack에서 제거
                -> stack이 비어있거나 괄호가 짝을 이루지 않으면 result는 false로 바뀌고 반복문이 종료된다.
             */
			for (int i = 0; i < s.length(); i++) {
				switch (s.charAt(i)) {
					case '(':
						st.push('(');
						break;
					case '[':
						st.push('[');
						break;
					case ')':
						if (st.empty() || st.peek() != '(') { // peek로 stack에 마지막으로 저장된 괄호가 짝을 이루는지 확인
							result = false;
							break;
						} else {
							st.pop();
							break;
						}
					case ']':
						if (st.empty() || st.peek() != '[') {
							result = false;
							break;
						} else {
							st.pop();
							break;
						}
				}
				if (!result) {
					break;
				}
			}
			if (result && st.empty()) {
				sb.append("yes").append('\n');
			} else {
				sb.append("no").append('\n');
			}
            st.clear();
		}
		br.close();
		System.out.println(sb);
	}
}