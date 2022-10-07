import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //벌집 구조에서는 밖으로 나올수록 갯수가 6의 배수씩 많아진다.

        // N입력 받고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int numMax = 1;
        int count = 0;

        //최댓값 넘을대마다 count 1씩 추가
        //while문으로 num<N 일 때, 반복하도록
        if (N == 1) {
            System.out.println(1);
        }

        else {
            while(numMax < N){
                numMax += 6 * count;
                count++;
            }
            System.out.println(count);
        }
    }
}
