import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력값 받기

        int[] numbers = new int[9]; // 9개 저장되는 배열 만들기
        for(int i = 0; i<9; i++){   // 입력값 하나씩 배열에 저장
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];   //배열 첫요소를 max로 임의 선정
        int maxCount = 1;   //첫요소 첫번째숫자라고 1

        for (int i = 1; i < numbers.length; i++){ // numbers[1]부터 순회하게
            if (numbers[i] > max){
                max = numbers[i];
                maxCount = i+1;   // max 저장 숫자보다 크면 몇번째 숫자인지 체크
            }
        }

        System.out.println(max);
        System.out.println(maxCount);
    }
}