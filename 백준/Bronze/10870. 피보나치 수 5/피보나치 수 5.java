import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int num){
        if (num <= 1) return num;
        return fibonacci(num - 2) + fibonacci(num - 1);
    }
}