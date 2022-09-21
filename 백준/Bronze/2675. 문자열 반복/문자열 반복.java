import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력값 받기

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int count = sc.nextInt();
            String S = sc.next();

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}