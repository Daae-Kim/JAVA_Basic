import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];

        for(int i =0; i<N; i++){
            st = new StringTokenizer(in.readLine(), " ");
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0; i<N; i++){
            st = new StringTokenizer(in.readLine(), " ");
            for(int j=0; j<M; j++){
                arr[i][j] = arr[i][j]+Integer.parseInt(st.nextToken());
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}