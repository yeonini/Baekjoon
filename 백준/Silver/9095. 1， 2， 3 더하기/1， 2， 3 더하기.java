import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			sb.append(function(n)).append('\n');
		}
		br.close();
		System.out.println(sb);
	}

	public static int function(int n) {
		if(n <= 2) {
			return n;
		}
		else if(n == 3) {
			return 4;
		}
		else {
			return function(n-1) + function(n-2) + function(n-3);
		}
	}
}