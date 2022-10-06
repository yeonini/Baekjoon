import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        //A~Z 갯수 담을 26개 배열 만들기
        int[] alphabet = new int[26];

        //단어 한글자씩 잘라서 배열에 횟수 추가
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 65;
            alphabet[idx]++;
        }

        //배열의 max 값(최대 횟수) 구하기
        int max = Arrays.stream(alphabet)
                .max()
                .getAsInt();
        
        int count = 0;
        int maxIdx = 0;
        
        //max와 일치하면 maxIdx에 저장, count++
        for (int i = 0; i < alphabet.length; i++){
            if (alphabet[i] == max){
                maxIdx = i;
                count++;
            }
        }
        
        // 최대값 1개면 최대값 아스키 문자로 변환해서 출력
        if (count == 1){
            char result = (char)(maxIdx + 'A');
            System.out.println(result);
        }
        // 최대값 1개 아니면 ? 출력
        else {
            System.out.println("?");
        }
    }
}
