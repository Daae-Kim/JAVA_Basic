import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {8, 7, 6, 5, 4, 3, 2, 1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        if (Arrays.equals(input, arr1)) {
            System.out.println("ascending");
        } else if (Arrays.equals(input, arr2)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}