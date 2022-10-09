import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //N, K 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1부터 N까지 가지는 리스트 생성
        ArrayList<Integer> list = new ArrayList<>(N);
        for (int i = 1; i <= N; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder("<");
        // K씩 증가하는 인덱스 값을 삭제
        int idx = 0;
        while (list.size() != 0){
            idx += K-1; // list가 0부터 시작하는게 아니여서 인덱스가 밀리기때문에 -1
            if (idx > list.size()-1){ // idx가 사이즈 넘으면 나눈 나머지로..
                idx %= list.size();
            }
            sb.append(list.get(idx)).append(", "); //sb에 삭제하는 문자 넣기
            list.remove(idx); // 리스트에서 삭제
        }

        sb.setLength(sb.length() - 2); //마지막 ", " 지우기
        sb.append(">");
        System.out.println(sb);
    }
}