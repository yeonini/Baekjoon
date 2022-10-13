//10845 큐
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static int[] arr;
    public static int front = 0;
    public static int back = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        arr = new int[N+1]; // pop 하면 frontIdx++해주기때문에 오류 방지 위해서 N+1

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(pop()).append("\n");
                    break;

                case "size" :
                    sb.append(size()).append("\n");
                    break;

                case "empty" :
                    sb.append(empty()).append("\n");
                    break;

                case "front" :
                    sb.append(front()).append("\n");
                    break;

                case "back" :
                    sb.append(back()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    /*push 메서드 : 배열에 넣고, 백+1*/
    public static void push(int num){
        arr[back] = num;
        back++;
    }

    /*pop 메서드 생성 : 배열 비어있으면 -1 리턴*/
    /*첫번째 요소 0으로 바꾸고 리턴, 프론인덱스 +1*/
    public static int pop(){
        if (back - front == 0) {
            return -1;
        }
        else{
            int firstNum = arr[front];
            arr[front] = 0;
            front++;
            return firstNum;
        }
    }

    /*size : back - front 리턴*/
    public static int size(){
        return back - front;
    }

    /*empty 메서드 : 비어있으면 1리턴, 아니면 0리턴*/
    public static int empty(){
        if (back - front == 0) {return 1;}
        else {return 0;}
    }

    /*front 메서드 : 앞요소 리턴, 비어있으면 -1*/
    public static int front(){
        if (back - front == 0) {return -1;}
        else {return arr[front];}
    }

    /*back 메서드 : 뒷요소 리턴, 비어있으면 -1*/
    public static int back(){
        if (back - front == 0) {return -1;}
        else {return arr[back-1];}
    }
}