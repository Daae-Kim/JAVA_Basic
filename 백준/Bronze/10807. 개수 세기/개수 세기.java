import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] s) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int[] arr = new int[N];
        int count = 0;

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(in.readLine());
        for(int j =0; j < N; j++){
            if(arr[j] == X){
               count++;
            }
        }System.out.println(count);
    }}