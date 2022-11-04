import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 자연수 a, b 받기 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        /* 최대공약수(GCD) 구하기 */
        int GCD = gcd(a, b);

        /* 최소공배수(LCM) 구하기 */
        int LCM = a * b / GCD;

        System.out.println(GCD);
        System.out.println(LCM);
    }

    /* 유클리드 호제법 이용해서 최대공약수구하는 메서드 */
    /* 코플릿 [Java] 알고리즘 8번 빼빼로데이 참고 */
    public static int gcd(int a, int b){
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
/* GCD 예시
    (ex) a = 12, b= 8
            GCD(최대공약수) = 4
            gcd(12, 8) > gcd(8, 4) >> GCD = 4
*/

/* LCM 예시
    (ex) a = 12, b= 8
    GCD(최대공약수) = 4
    LCM(최소공배수) = 24
                  = 4 * 3 * 2
                  = 4 * (12/4) * (8/4)
                  = 12 * 8 / 4
                  = a * b / GCD
*/

/* 유클리드 호제법
    A = B * Q + R
    (여기서 A와 B의 최대공약수는 G, R은 나머지)

    a*G = b*G*Q + R
    R = G(a-b*Q)
    (R(나머지값)도 최대공약수 G를 가진다..!)
    (재귀함수로 B와 R을 넘겨가면서 진행)
 */