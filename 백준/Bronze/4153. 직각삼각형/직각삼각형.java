import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while로 반복
        //0 0 0이면 break
        while(true){
            String line = br.readLine();
            if (line.equals("0 0 0")) break;

            // 토크나이저로 숫자 3개 받아서 배열에 넣어주기
            StringTokenizer st = new StringTokenizer(line, " ");
            int[] len = new int[3];

            for (int i = 0; i < len.length; i++) {
                len[i] = Integer.parseInt(st.nextToken());
            }

            // 오름차순 정렬(가장 긴 변 찾기 위함)
            Arrays.sort(len);

            // 피타고라스의 정리 이용하여 직각삼각형인지 확인
            if (len[2]*len[2] == len[0]*len[0] + len[1]*len[1]) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
        br.close();
    }
}