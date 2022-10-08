import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        //버퍼로 갯수 받아오기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //문자열 배열 생성 후, 차례로 받아오기
        String[] arr = new String[N];
        for (int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        //사용자 정의 순으로 정렬해주기(길이순정렬 > 사전순정렬)
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                // 길이 같으면 s1, s2비교해서 사전순으로 정렬
                if (s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                // 길이 다르면 계산해서 음수면 s1, s2 양수면 s2, s1
                else{
                    return s1.length() - s2.length();
                }
            }
        });

        //중복 제거위해서 set으로 저장
        //그냥 HashSet으로 하면 순서가 랜덤하게 섞이기때문에 LinkedHashSet을 사용해야 한다.
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        // StringBuilder로 출력
        StringBuilder sb = new StringBuilder("");
        for (String str : set) {
            sb.append(str).append("\n");
        }

        //마지막 공백 제거하고 출력
        System.out.println(sb);
    }
}