import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            if (str.equals("0")) {break;}   // 0 입력 들어오면 while 반복문 종료
            
            //StringBuilder 이용해서 뒤집은 문자열 생성
            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();
            
            int count = 0;
            //절반까지 반복하면서 str과 reverse같은지 확인
            //다르면 count 더해주기(구분해서 no 출력하기 위함)
            for (int i = 0; i < str.length()/2; i++){
                if (str.charAt(i) != reverse.charAt(i)) {
                    count++;
                }
            }
            
            //count 0이면 yes, 아니면 no
            if (count == 0) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
