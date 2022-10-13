// 10828 스택
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int size = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

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

                case "top" :
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    /*push 메서드 : 배열에 넣고, size 하나 추가*/
    public static void push(int num){
        arr[size] = num;
        size++;
    }

    /*pop 메서드 생성 : 배열 비어있으면(size == 0)이면 -1 리턴*/
    /*arr에서 마지막요소(size-1 인덱스) 0으로 바꾸고 리턴, size 하나 빼기*/
    public static int pop(){
        if (size == 0) {return -1;}
        else{
            int lastNum = arr[size-1];
            arr[size-1] = 0;
            size--;
            return lastNum;
        }
    }

    /*size : size 리턴*/
    public static int size(){
        return size;
    }

    /*empty 메서드 : 비어있으면(size==0)이면 1리턴, 아니면 0리턴*/
    public static int empty(){
        if (size == 0) {return 1;}
        else {return 0;}
    }

    /*top 메서드 : 비어있으면(size==0)이면 -1리턴, 아니면 마지막요소(size-1 인덱스)리턴*/
    public static int top(){
        if (size == 0) {return -1;}
        else {return arr[size-1];}
    }
}