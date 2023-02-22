// 10773 제로
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		int K = Integer.parseInt(br.readLine()); // 숫자 갯수
		int number = 0; // 숫자
		int sum = 0; // 합계

		/* 숫자가 0이면 마지막 요소 삭제, 0이 아니면 list에 추가 */
		for (int i = 0; i < K; i++) {
			number = Integer.parseInt(br.readLine());
			if (number == 0) {
				list.remove(list.size() - 1);
			} else {
				list.add(number);
			}
		}
		br.close();

		/* 합계 구하기 */
		for (int num : list) {
			sum += num;
		}
		
		System.out.println(sum);
	}
}