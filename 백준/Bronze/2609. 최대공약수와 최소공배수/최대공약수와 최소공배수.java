import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //자연수 a, b 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //최대공약수(GCD)
        int GCD = gcd(a, b);

        //최소공배수(LCM) = GCD * (a / GCD) * (b / GCD)
        //ex) 8, 12 >>> GCD = 4, LCM = 24 = 4 * ( 8 / 4 ) * ( 12 / 4 )
        int LCM = a * b / GCD;

        System.out.println(GCD);
        System.out.println(LCM);
    }
    public static int gcd(int a, int b){
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
