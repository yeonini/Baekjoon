import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        while(true){
            /* 5로 딱 떨어지는 경우 */
            if(N % 5 == 0){
                count += N/5;
                break;
            }

            /* 5로 안나눠떨어지면 3kg 빼고 다시 반복 */
            else{
                N -= 3;
                count++;
            }

            /* 키로수 못 맞추는 경우 -1 */
            if(N < 0){
                count = -1;
                break;
            }
        }

        System.out.println(count);
    }
}