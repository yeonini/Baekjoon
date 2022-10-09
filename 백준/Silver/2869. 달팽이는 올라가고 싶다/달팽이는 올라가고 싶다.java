import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //A, B, V 받기. int형으로 받으면 뒤에 day 계산결과가 잘 안나와서 double로 받기
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double V = Integer.parseInt(st.nextToken());

        //이동 거리 A + (A-B)(day-1) >= V 되는 날 찾으면 된다.
        //((V - A) / (A-B)) + 1 = day (day는 계산결과에서 소수점 올림한 값)
        double day = ((V - A) / (A - B)) + 1;
        System.out.println((int) Math.ceil(day));
    }
}