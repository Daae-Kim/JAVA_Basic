import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] s) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        for(int i=0; i<28; i++) {
            int n = Integer.parseInt(in.readLine());
            int a = n-1;
                arr[a] = n;
        }
        for(int j=0; j<30; j++){
            if(arr[j]==0){
                System.out.println(j+1);
            }
        }
    }
}