import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] splited = bf.readLine().split(" ");
        bf.close();
        
        int[] values = Arrays.stream(splited)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] ascen = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] descen = new int[]{8, 7, 6, 5, 4, 3, 2, 1};

        String result = "";

        if (Arrays.equals(values, ascen)) {
            result = "ascending";
        }
        else if (Arrays.equals(values, descen)) {
            result = "descending";
        }
        else {
            result = "mixed";
        }

        System.out.println(result);
    }
}