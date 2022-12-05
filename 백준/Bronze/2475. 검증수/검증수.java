import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");
        int result =0;
        for(int i=0; i<5; i++){
            int n = Integer.parseInt(st.nextToken());
            result = result + (n*n);
        }
        System.out.println(result%10);
    }
}