import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 버퍼 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;

        // getBytes로 문자열 한 문자씩 받아오기
        for(byte num : br.readLine().getBytes()){
            sum += num - '0';
        }

        br.close();

        // sum 출력
        System.out.println(sum);
    }
}