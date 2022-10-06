import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Set 선언
        HashSet<Integer> set = new HashSet<>();

        //숫자 10개 입력받아서, 42로 나눈 나머지 구하고, 그 값을 set에 저장
        for (int i = 0; i < 10; i++){
            int n = Integer.parseInt(br.readLine());
            set.add(n % 42);
        }

        //set의 size 출력
        System.out.println(set.size());
    }
}
