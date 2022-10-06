import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 과목수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        //과목수만큼 점수배열 만들고, 토크나이저로 추가
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double[] scores = new double[test];

        for(int i = 0; i < test; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        //성적 최대값 구하기
        double maxScore = Arrays.stream(scores)
                .max()
                .getAsDouble();

        //모든 성적을 조작(성적/최대*100)
        double sum = 0;
        for(double score : scores){
            score = (score/maxScore)*100;
            sum += score;
        }

        //성적 평균 출력
        double avg = sum/test;
        System.out.println(avg);
    }
}
