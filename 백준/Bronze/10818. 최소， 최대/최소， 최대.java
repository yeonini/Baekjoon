import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입출력 위해서 버퍼리더, 버퍼라이터 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 첫 줄의 갯수 받아오고 그 크기의 배열 생성
        int num  = Integer.parseInt(br.readLine());
        int[] numArr = new int[num];

        // 공백 단위로 자르기 위해서 토크나이저 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        // 배열에 토크나이저로 받아온 숫자 넣어주기
        for (int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        // 스트림으로 최대값 최소값 찾기
        int min = Arrays.stream(numArr)
                .min()
                .getAsInt();
        int max = Arrays.stream(numArr)
                .max()
                .getAsInt();

        // 최소 최대로 출력
        bw.write(String.format("%d %d", min, max));
        bw.flush();
        bw.close();
    }
}