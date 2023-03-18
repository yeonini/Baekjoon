//1764 듣보잡
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()); // 듣
		int M = Integer.parseInt(st.nextToken()); // 보

		// N만큼 Set 에 저장
		HashSet set = new HashSet();
		while (N-- > 0) {
			set.add(br.readLine());
		}

		// M만큼 Set에 이름 있는지 확인. 있으면 list 추가
		ArrayList list = new ArrayList();
		while (M-- > 0) {
			String name = br.readLine();
			if(set.contains(name)) {
				list.add(name);
			}
		}
		br.close();

		// 리스트 오름차순 정렬, 사람 수, 하나씩 sb에 저장
		Collections.sort(list);
		sb.append(list.size()).append('\n');
		for (Object name : list) {
			sb.append(name).append('\n');
		}

		System.out.println(sb);
	}
}