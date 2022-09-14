import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

        M = M + T;
        if (M >= 60) {
            H += (M / 60);
            M = (M % 60);
        }
        if (H >= 24) {
            H = (H % 24);
        }
        System.out.printf("%d %d", H, M);
    }
}