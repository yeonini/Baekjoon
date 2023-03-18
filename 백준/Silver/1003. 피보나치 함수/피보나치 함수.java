// 1003 피보나치 함수
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		/*
		* fi(0) -> 0			// 1 0
		* fi(1) -> 0 1			// 0 1
		* fi(2) -> fi(1), fi(0) // 1 1
		* fi(3) -> fi(2), fi(1) // 1 2
		* fi(4) -> fi(3), fi(2) // 2 3
		* fi(5) -> fi(4), fi(3) // 3 5
		* fi(6) -> fi(5), fi(4) // 5 8
		*
		* 0, 1도 index2부터 피보나치
		*
		* 0배열[index] = 0배열[index-1] + 0배열[index-2]
		* 1배열[index] = 0배열[index] + 0배열[index-1]
		* */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		int index = 0;
		while (T-- > 0) {
			index = Integer.parseInt(br.readLine());

			switch (index) {
				case 0:
					sb.append("1 0").append('\n');
					break;
				case 1:
					sb.append("0 1").append('\n');
					break;
				default:
					sb.append(fibo(index)).append('\n');
			}
		}
		br.close();

		System.out.println(sb);
	}

	/**
	 * 0과 1에 대한 피보나치 계산 함수
	 * @return 0갯수 + " " + 1갯수
	 */
	public static String fibo(int index) {
		int[] fibo = new int[41];
		fibo[0] = 1;
		fibo[1] = 0;
		for (int i = 2; i <= index; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[index] + " " + (fibo[index] + fibo[index-1]);
	}
}