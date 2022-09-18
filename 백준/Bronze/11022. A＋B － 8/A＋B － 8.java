import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= count; i++){
            String str = br.readLine();
            int a  = Integer.parseInt(str.split(" ")[0]);
            int b  = Integer.parseInt(str.split(" ")[1]);

            System.out.printf("Case #%d: %d + %d = %d\n", i, a, b, a+b);
        }
    }
}