import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] white = new int[6];
        int[] black = new int[]{1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++){
            white[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++){
            white[i] = black[i] - white[i];
            System.out.println(white[i]);
        }
    }
}
