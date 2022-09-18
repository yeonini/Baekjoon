import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            String str = br.readLine();
            int num1 = Integer.parseInt(str.split(" ")[0]);
            int num2 = Integer.parseInt(str.split(" ")[1]);
            bw.write(num1 + num2 + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}