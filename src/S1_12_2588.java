import java.util.Scanner;

public class S1_12_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // num2의 각 자리 수 구하기
        int one_digit = num2 % 10;  // 일의 자리
        int ten_digit = (num2 / 10) % 10;   // 십의 자리
        int hun_digit = num2 / 100; // 백의 자리

        // num3~6 출력
        System.out.println(num1 * one_digit);
        System.out.println(num1 * ten_digit);
        System.out.println(num1 * hun_digit);
        System.out.println(num1 * num2);
    }
}
