//10866 덱
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static ArrayList<Integer> list = new ArrayList<>();
    public static int size = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){
                case "push_front" :
                    push_front(Integer.parseInt(st.nextToken()));
                    break;

                case "push_back" :
                    push_back(Integer.parseInt(st.nextToken()));
                    break;

                case "pop_front" :
                    sb.append(pop_front()).append("\n");
                    break;

                case "pop_back" :
                    sb.append(pop_back()).append("\n");
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
    /*push_front 메서드 : 0번 인덱스에 추가*/
    public static void push_front(int num){
        list.add(0, num);
        size++;
    }

    /*push_back 메서드 : size 인덱스에 추가 */
    public static void push_back(int num){
        list.add(size, num);
        size++;
    }

    /*pop_front 메서드 생성 : 배열 비어있으면 -1, 아니면 0번 삭제*/
    public static int pop_front(){
        if (size == 0) {
            return -1;
        }
        else{
            size--;
            return list.remove(0);
        }
    }

    /*pop_back 메서드 생성 : 배열 비어있으면 -1, 아니면 size번 삭제*/
    public static int pop_back(){
        if (size == 0) {
            return -1;
        }
        else{
            int backNum = list.remove(size-1);
            size--;
            return backNum;
        }
    }

    /*size : size 리턴*/
    public static int size(){
        return size;
    }

    /*empty 메서드 : 비어있으면 1리턴, 아니면 0리턴*/
    public static int empty(){
        if (size == 0) {return 1;}
        else {return 0;}
    }

    /*front 메서드 : 앞요소 리턴, 비어있으면 -1*/
    public static int front(){
        if (size == 0) {return -1;}
        else {return list.get(0);}
    }

    /*back 메서드 : 뒷요소 리턴, 비어있으면 -1*/
    public static int back(){
        if (size == 0) {return -1;}
        else {return list.get(size-1);}
    }
}