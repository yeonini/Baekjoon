// 11399 ATM
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		/*
		* 오름차순으로 하나씩 더하면 최소 시간
		*/
		int num = Integer.parseInt(br.readLine());
		int[] list = new int[num];
		st = new StringTokenizer(br.readLine(), " ");

		for(int i = 0; i < num; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(list);

		int sum = 0;
		int temp = 0;
		for(int j = 0; j < num; j++) {
			temp += list[j];
			sum += temp;
		}

		System.out.println(sum);
	}
}