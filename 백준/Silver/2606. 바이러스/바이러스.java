import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[][] graph;
	static boolean[] visited;
	static int cpNum, count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		// cpNum: 컴퓨터 수, nwNum: 네트워크 수
		cpNum = Integer.parseInt(br.readLine());
		int nwNum = Integer.parseInt(br.readLine());

		// net: 네트워크 여부, visited: 방문 여부
		graph = new boolean[cpNum + 1][cpNum + 1];
		visited = new boolean[cpNum + 1];

		/*네트워크 쓰여있는거 보고 그래프 양방향으로 추가해주기*/
		while(nwNum-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			graph[a][b] = graph[b][a] = true;
		}

		bfs(1);
		System.out.println(count);
	}

	/*너비우선탐색*/
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();

		// 시작 노드 방문 true로 바꾸고, queue에 추가
		visited[start] = true;
		queue.add(start);

		while(!queue.isEmpty()) {
			int temp = queue.poll(); // 탐색 현위치
			for (int i = 1; i <= cpNum; i++) {
				// 이어져있고, 방문 안 했으면 queue 더하고, 방문 true, count 추가
				if(graph[temp][i] == true && visited[i] == false){
					queue.add(i);
					visited[i] = true;
					count++;
				}
			}
		}
	}
}