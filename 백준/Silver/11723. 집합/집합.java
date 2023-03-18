import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int S = 0; // 공집합
		int M = Integer.parseInt(br.readLine()); // 연산의 수

		while(M-- > 0){
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			int x = 0;
			if(st.hasMoreTokens()){
				x = Integer.parseInt(st.nextToken())-1;
			}

			switch (str){
				case "add":
					S |= (1 << x);
					break;
				case "remove":
					S &= ~(1 << x);
					break;
				case "check":
					if ((S & (1 << x))!= 0) {
						sb.append(1).append('\n');
					}
					else {
						sb.append(0).append('\n');
					}
					break;
				case "toggle":
					S ^= (1 << x);
					break;
				case "all":
					S |= ~0;
					break;
				case "empty":
					S = 0;
					break;
			}
		}
		System.out.println(sb);
		br.close();
	}
}