// 1620 나는야 포켓몬 마스터 이다솜
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()); // 포켓몬 수
		int M = Integer.parseInt(st.nextToken()); // 문제 수

		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			String num = String.valueOf(i + 1);
			map.put(num, name);
			map.put(name, num);
		}

		for (int j = 0; j < M; j++) {
			String str = br.readLine();
			sb.append(map.get(str)).append('\n');
		}
		br.close();
		System.out.println(sb);
	}
}