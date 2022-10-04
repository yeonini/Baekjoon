import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 테스트 횟수 받고
        // br.read()로 하면 아스키코드로 받아오므로 -48을 해줘야한다.
        // br.readLine()으로 문자열 받고 형변환 해주는 것이 속 편해보임!
        int test = Integer.parseInt(br.readLine());
        // 횟수만큼 bf.readLine()으로 케이스 받아서 리스트 만들기
        ArrayList<String> tCase = new ArrayList<>();
        for(int i = 0; i < test; i++){
            tCase.add(br.readLine());
        }

        // count와 sum 변수 선언
        int count = 0;
        int sum = 0;

        // 리스트 요소 반복하면서
        for(String tcase : tCase){
            count = 0;
            sum = 0;

            for(int j = 0; j < tcase.length(); j++){
                // if O면 count더해주고 sum에 더해주기
                if(tcase.charAt(j) == 'O') {
                    count++;
                    sum += count;
                }
                // else면(X면) count 0으로 초기화
                else{
                    count = 0;
                }
            }
            //테스트 케이스마다 sum출력
            System.out.println(sum);
        }
    }
}